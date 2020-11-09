package cn.itrip.controller;

import cn.itrip.dao.itripHotel.ItripHotelMapper;
import cn.itrip.dao.itripUser.ItripUserMapper;
import cn.itrip.pojo.ItripUser;
import cn.itrip.pojo.ItripUserVO;
import com.alibaba.fastjson.JSONArray;
import com.cloopen.rest.sdk.CCPRestSmsSDK;
import cz.mallat.uasparser.UserAgentInfo;
import itrip.common.*;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

@Controller
public class HoltelContoller {

    @Resource
    ItripUserMapper userdao;
    @Resource
    JredisApi jredisApi;

    @Resource
    ItripUserMapper dao1;


    @RequestMapping("/api/validatephone")
    @ResponseBody
    public  Dto dologin1(String user,String code) throws Exception {

        String value=jredisApi.getRedis(user);
        if (value.equals(code))
        {
            dao1.up(user);
            return DtoUtil.returnDataSuccess("激活成功");
        }
        return DtoUtil.returnFail("失败","1000");
    }



    //api/registerbyphone
    @RequestMapping("/api/registerbyphone")
    @ResponseBody
    public  Dto dologin(@RequestBody ItripUserVO userVo, HttpServletRequest request) throws Exception {
        ItripUser itripUser =new ItripUser();
        itripUser.setUserPassword(MD5.getMd5(userVo.getUserPassword(),32));
        itripUser.setUserCode(userVo.getUserCode());
        itripUser.setUserName(userVo.getUserName());
        itripUser.setActivated(0);

        //发短信


        int number = (int) (Math.random()*9999+1000);
        sentsms(userVo.getUserCode(),""+number);


        //存redis


        jredisApi.SetRedis(userVo.getUserCode(),""+number,7200);


        dao1.insertItripUser(itripUser);

        return DtoUtil.returnDataSuccess("注册成功");
    }


    public void sentsms(String phone,String sms)
    {
        HashMap<String, Object> result = null;

        //初始化SDK
        CCPRestSmsSDK restAPI = new CCPRestSmsSDK();

        //******************************注释*********************************************
        //*初始化服务器地址和端口                                                       *
        //*沙盒环境（用于应用开发调试）：restAPI.init("sandboxapp.cloopen.com", "8883");*
        //*生产环境（用户应用上线使用）：restAPI.init("app.cloopen.com", "8883");       *
        //*******************************************************************************
        restAPI.init("app.cloopen.com", "8883");

        //******************************注释*********************************************
        //*初始化主帐号和主帐号令牌,对应官网开发者主账号下的ACCOUNT SID和AUTH TOKEN     *
        //*ACOUNT SID和AUTH TOKEN在登陆官网后，在“应用-管理控制台”中查看开发者主账号获取*
        //*参数顺序：第一个参数是ACOUNT SID，第二个参数是AUTH TOKEN。                   *
        //*******************************************************************************
        restAPI.setAccount("8aaf07087291adde0172a104510d08d8", "6377adba251d4d87b57a96bc23dd7612");


        //******************************注释*********************************************
        //*初始化应用ID                                                                 *
        //*测试开发可使用“测试Demo”的APP ID，正式上线需要使用自己创建的应用的App ID     *
        //*应用ID的获取：登陆官网，在“应用-应用列表”，点击应用名称，看应用详情获取APP ID*
        //*******************************************************************************
        restAPI.setAppId("8aaf07087291adde0172a10452ce08de");


        //******************************注释****************************************************************
        //*调用发送模板短信的接口发送短信                                                                  *
        //*参数顺序说明：                                                                                  *
        //*第一个参数:是要发送的手机号码，可以用逗号分隔，一次最多支持100个手机号                          *
        //*第二个参数:是模板ID，在平台上创建的短信模板的ID值；测试的时候可以使用系统的默认模板，id为1。    *
        //*系统默认模板的内容为“【云通讯】您使用的是云通讯短信模板，您的验证码是{1}，请于{2}分钟内正确输入”*
        //*第三个参数是要替换的内容数组。																														       *
        //**************************************************************************************************

        //**************************************举例说明***********************************************************************
        //*假设您用测试Demo的APP ID，则需使用默认模板ID 1，发送手机号是13800000000，传入参数为6532和5，则调用方式为           *
        //*result = restAPI.sendTemplateSMS("13800000000","1" ,new String[]{"6532","5"});																		  *
        //*则13800000000手机号收到的短信内容是：【云通讯】您使用的是云通讯短信模板，您的验证码是6532，请于5分钟内正确输入     *
        //*********************************************************************************************************************
        result = restAPI.sendTemplateSMS("13161085577","1" ,new String[]{sms,"5"});

        System.out.println("SDKTestGetSubAccounts result=" + result);
        if("000000".equals(result.get("statusCode"))){
            //正常返回输出data包体信息（map）
            HashMap<String,Object> data = (HashMap<String, Object>) result.get("data");
            Set<String> keySet = data.keySet();
            for(String key:keySet){
                Object object = data.get(key);
                System.out.println(key +" = "+object);

            }


        }else{
            //异常返回输出错误码和错误信息
            System.out.println("错误码=" + result.get("statusCode") +" 错误信息= "+result.get("statusMsg"));


        }
    }


    @RequestMapping("/api/dologin")
    @ResponseBody
    public  Dto dologin(String name,String password,HttpServletRequest request) throws Exception {
        String pas=MD5.getMd5(password,32);
        System.out.println(pas);
        ItripUser user =userdao.dologin(name,MD5.getMd5(password,32));
        if (user!=null)
        {
            String key=generateToken(request.getHeader("User-Agent"),user);
            String value=JSONArray.toJSONString(user);
            if (jredisApi.getRedis(key)==null)
            {
                jredisApi.SetRedis(key,value,60*60*2);
            }

            ItripTokenVO tokenVO =new ItripTokenVO(key,Calendar.getInstance().getTimeInMillis()+7200,Calendar.getInstance().getTimeInMillis());


           return DtoUtil.returnDataSuccess(tokenVO);
        }
       return DtoUtil.returnDataSuccess("登录失败");
    }


    public String generateToken(String agent, ItripUser user) {
        // TODO Auto-generated method stub
        try {
            UserAgentInfo userAgentInfo = UserAgentUtil.getUasParser().parse(
                    agent);
            StringBuilder sb = new StringBuilder();
            sb.append("token:");//统一前缀
            if (userAgentInfo.getDeviceType().equals(UserAgentInfo.UNKNOWN)) {
                if (UserAgentUtil.CheckAgent(agent)) {
                    sb.append("MOBILE-");
                } else {
                    sb.append("PC-");
                }
            } else if (userAgentInfo.getDeviceType()
                    .equals("Personal computer")) {
                sb.append("PC-");
            } else
                sb.append("MOBILE-");
//			sb.append(user.getUserCode() + "-");
            sb.append(MD5.getMd5(user.getUserCode(),32) + "-");//加密用户名称
            sb.append(user.getId() + "-");
            sb.append(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())
                    + "-");
            sb.append(MD5.getMd5(agent, 6));// 识别客户端的简化实现——6位MD5码

            return sb.toString();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }



    @Resource
    ItripHotelMapper dao;

    @RequestMapping("/list")
    @ResponseBody
    public Object getlist() throws Exception {
        return  dao.getItripHotelById(new Long(1));
    }


}
