package cn.zouhuachao.mapper;

import cn.zouhuachao.pojo.Payroll;
import cn.zouhuachao.pojo.PayrollExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayrollMapper {
    int countByExample(PayrollExample example);

    int deleteByExample(PayrollExample example);

    int deleteByPrimaryKey(String payId);

    int insert(Payroll record);

    int insertSelective(Payroll record);

    List<Payroll> selectByExample(PayrollExample example);

    Payroll selectByPrimaryKey(String payId);

    int updateByExampleSelective(@Param("record") Payroll record, @Param("example") PayrollExample example);

    int updateByExample(@Param("record") Payroll record, @Param("example") PayrollExample example);

    int updateByPrimaryKeySelective(Payroll record);

    int updateByPrimaryKey(Payroll record);
}