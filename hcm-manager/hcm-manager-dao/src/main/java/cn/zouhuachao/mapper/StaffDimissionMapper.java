package cn.zouhuachao.mapper;

import cn.zouhuachao.pojo.StaffDimission;
import cn.zouhuachao.pojo.StaffDimissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffDimissionMapper {
    int countByExample(StaffDimissionExample example);

    int deleteByExample(StaffDimissionExample example);

    int deleteByPrimaryKey(String dimissionid);

    int insert(StaffDimission record);

    int insertSelective(StaffDimission record);

    List<StaffDimission> selectByExample(StaffDimissionExample example);

    StaffDimission selectByPrimaryKey(String dimissionid);

    int updateByExampleSelective(@Param("record") StaffDimission record, @Param("example") StaffDimissionExample example);

    int updateByExample(@Param("record") StaffDimission record, @Param("example") StaffDimissionExample example);

    int updateByPrimaryKeySelective(StaffDimission record);

    int updateByPrimaryKey(StaffDimission record);
}