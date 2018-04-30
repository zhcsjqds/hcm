package cn.zouhuachao.mapper;

import cn.zouhuachao.pojo.StaffTransfer;
import cn.zouhuachao.pojo.StaffTransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffTransferMapper {
    int countByExample(StaffTransferExample example);

    int deleteByExample(StaffTransferExample example);

    int deleteByPrimaryKey(String transid);

    int insert(StaffTransfer record);

    int insertSelective(StaffTransfer record);

    List<StaffTransfer> selectByExample(StaffTransferExample example);

    StaffTransfer selectByPrimaryKey(String transid);

    int updateByExampleSelective(@Param("record") StaffTransfer record, @Param("example") StaffTransferExample example);

    int updateByExample(@Param("record") StaffTransfer record, @Param("example") StaffTransferExample example);

    int updateByPrimaryKeySelective(StaffTransfer record);

    int updateByPrimaryKey(StaffTransfer record);
}