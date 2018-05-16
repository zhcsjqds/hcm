package cn.zouhuachao.mapper;

import cn.zouhuachao.pojo.InsRate;
import cn.zouhuachao.pojo.InsRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InsRateMapper {
    int countByExample(InsRateExample example);

    int deleteByExample(InsRateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InsRate record);

    int insertSelective(InsRate record);

    List<InsRate> selectByExample(InsRateExample example);

    InsRate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InsRate record, @Param("example") InsRateExample example);

    int updateByExample(@Param("record") InsRate record, @Param("example") InsRateExample example);

    int updateByPrimaryKeySelective(InsRate record);

    int updateByPrimaryKey(InsRate record);
}