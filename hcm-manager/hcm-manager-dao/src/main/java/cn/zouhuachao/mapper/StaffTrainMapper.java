package cn.zouhuachao.mapper;

import cn.zouhuachao.pojo.StaffTrain;
import cn.zouhuachao.pojo.StaffTrainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffTrainMapper {
    int countByExample(StaffTrainExample example);

    int deleteByExample(StaffTrainExample example);

    int deleteByPrimaryKey(String trainId);

    int insert(StaffTrain record);

    int insertSelective(StaffTrain record);

    List<StaffTrain> selectByExample(StaffTrainExample example);

    StaffTrain selectByPrimaryKey(String trainId);

    int updateByExampleSelective(@Param("record") StaffTrain record, @Param("example") StaffTrainExample example);

    int updateByExample(@Param("record") StaffTrain record, @Param("example") StaffTrainExample example);

    int updateByPrimaryKeySelective(StaffTrain record);

    int updateByPrimaryKey(StaffTrain record);
}