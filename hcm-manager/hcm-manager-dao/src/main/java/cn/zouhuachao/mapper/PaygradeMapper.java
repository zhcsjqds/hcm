package cn.zouhuachao.mapper;

import cn.zouhuachao.pojo.Paygrade;
import cn.zouhuachao.pojo.PaygradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaygradeMapper {
    int countByExample(PaygradeExample example);

    int deleteByExample(PaygradeExample example);

    int deleteByPrimaryKey(String paygradeid);

    int insert(Paygrade record);

    int insertSelective(Paygrade record);

    List<Paygrade> selectByExample(PaygradeExample example);

    Paygrade selectByPrimaryKey(String paygradeid);

    int updateByExampleSelective(@Param("record") Paygrade record, @Param("example") PaygradeExample example);

    int updateByExample(@Param("record") Paygrade record, @Param("example") PaygradeExample example);

    int updateByPrimaryKeySelective(Paygrade record);

    int updateByPrimaryKey(Paygrade record);
}