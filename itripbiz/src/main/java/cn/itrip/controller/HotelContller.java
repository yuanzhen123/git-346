package cn.itrip.controller;

import cn.itrip.dao.itripAreaDic.ItripAreaDicMapper;
import cn.itrip.dao.itripLabelDic.ItripLabelDicMapper;
import cn.itrip.pojo.ItripAreaDic;
import cn.itrip.pojo.ItripLabelDic;
import itrip.common.Dto;
import itrip.common.DtoUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class HotelContller {

    @Resource
    ItripAreaDicMapper dao;

    @Resource
    ItripLabelDicMapper dao1;

    @RequestMapping("api/hotel/queryhotcity/{type}")
    @ResponseBody
    public Dto getcity(@PathVariable("type") int type) throws Exception {
        List<ItripAreaDic> list =dao.getHot(type);
        return DtoUtil.returnDataSuccess(list);
    }

    @RequestMapping("api/hotel/queryhotelfeature")
    @ResponseBody
    public Dto gettop() throws Exception {
        List<ItripLabelDic> list =dao1





                .gettop();
        return DtoUtil.returnDataSuccess(list);
    }


}
