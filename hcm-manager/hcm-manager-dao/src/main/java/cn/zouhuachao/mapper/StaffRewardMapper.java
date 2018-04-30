package cn.zouhuachao.mapper;

import cn.zouhuachao.pojo.StaffReward;
import cn.zouhuachao.pojo.StaffRewardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffRewardMapper {
    int countByExample(StaffRewardExample example);

    int deleteByExample(StaffRewardExample example);

    int deleteByPrimaryKey(String awardid);

    int insert(StaffReward record);

    int insertSelective(StaffReward record);

    List<StaffReward> selectByExample(StaffRewardExample example);

    StaffReward selectByPrimaryKey(String awardid);

    int updateByExampleSelective(@Param("record") StaffReward record, @Param("example") StaffRewardExample example);

    int updateByExample(@Param("record") StaffReward record, @Param("example") StaffRewardExample example);

    int updateByPrimaryKeySelective(StaffReward record);

    int updateByPrimaryKey(StaffReward record);
}