package cn.itrip.dao.itripUser;
import cn.itrip.pojo.ItripUser;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface ItripUserMapper {


	public ItripUser dologin(@Param(value = "userCode") String userCode,@Param(value = "userPassword") String userPassword)throws Exception;

	public ItripUser getItripUserById(@Param(value = "id") Long id)throws Exception;

	public List<ItripUser>	getItripUserListByMap(Map<String, Object> param)throws Exception;

	public Integer getItripUserCountByMap(Map<String, Object> param)throws Exception;

	public Integer insertItripUser(ItripUser itripUser)throws Exception;

	public int up(@Param(value = "userCode") String userCode);

	public Integer updateItripUser(ItripUser itripUser)throws Exception;

	public Integer deleteItripUserById(@Param(value = "id") Long id)throws Exception;

}
