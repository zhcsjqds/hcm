package cn.zouhuachao.mapper;

import cn.zouhuachao.pojo.AttendanceStatistics;
import cn.zouhuachao.pojo.AttendanceStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttendanceStatisticsMapper {
    int countByExample(AttendanceStatisticsExample example);

    int deleteByExample(AttendanceStatisticsExample example);

    int deleteByPrimaryKey(String statid);

    int insert(AttendanceStatistics record);

    int insertSelective(AttendanceStatistics record);

    List<AttendanceStatistics> selectByExample(AttendanceStatisticsExample example);

    AttendanceStatistics selectByPrimaryKey(String statid);

    int updateByExampleSelective(@Param("record") AttendanceStatistics record, @Param("example") AttendanceStatisticsExample example);

    int updateByExample(@Param("record") AttendanceStatistics record, @Param("example") AttendanceStatisticsExample example);

    int updateByPrimaryKeySelective(AttendanceStatistics record);

    int updateByPrimaryKey(AttendanceStatistics record);
}