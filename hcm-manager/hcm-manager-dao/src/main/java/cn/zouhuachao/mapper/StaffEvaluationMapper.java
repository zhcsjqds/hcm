package cn.zouhuachao.mapper;

import cn.zouhuachao.pojo.StaffEvaluation;
import cn.zouhuachao.pojo.StaffEvaluationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffEvaluationMapper {
    int countByExample(StaffEvaluationExample example);

    int deleteByExample(StaffEvaluationExample example);

    int deleteByPrimaryKey(String evaid);

    int insert(StaffEvaluation record);

    int insertSelective(StaffEvaluation record);

    List<StaffEvaluation> selectByExample(StaffEvaluationExample example);

    StaffEvaluation selectByPrimaryKey(String evaid);

    int updateByExampleSelective(@Param("record") StaffEvaluation record, @Param("example") StaffEvaluationExample example);

    int updateByExample(@Param("record") StaffEvaluation record, @Param("example") StaffEvaluationExample example);

    int updateByPrimaryKeySelective(StaffEvaluation record);

    int updateByPrimaryKey(StaffEvaluation record);
}