package cn.zouhuachao.mapper;

import cn.zouhuachao.pojo.StaffPosition;
import cn.zouhuachao.pojo.StaffPositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffPositionMapper {
    int countByExample(StaffPositionExample example);

    int deleteByExample(StaffPositionExample example);

    int deleteByPrimaryKey(String positionId);

    int insert(StaffPosition record);

    int insertSelective(StaffPosition record);

    List<StaffPosition> selectByExample(StaffPositionExample example);

    StaffPosition selectByPrimaryKey(String positionId);

    int updateByExampleSelective(@Param("record") StaffPosition record, @Param("example") StaffPositionExample example);

    int updateByExample(@Param("record") StaffPosition record, @Param("example") StaffPositionExample example);

    int updateByPrimaryKeySelective(StaffPosition record);

    int updateByPrimaryKey(StaffPosition record);
}