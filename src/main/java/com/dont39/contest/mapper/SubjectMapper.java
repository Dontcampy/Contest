package com.dont39.contest.mapper;

import com.dont39.contest.entity.SubjectEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SubjectMapper {

    @Select("SELECT * FROM subject WHERE isparty = #{isParty} and type = #{type}")
    @Results({
            @Result(property = "subjectId", column = "id", javaType = Integer.class),
            @Result(property = "theme", column = "theme", javaType = Integer.class),
            @Result(property = "content", column = "content", javaType = String.class),
            @Result(property = "choice", column = "choice", javaType = String.class),
            @Result(property = "answer", column = "answer", javaType = String.class),
            @Result(property = "isParty", column = "isparty", javaType = Boolean.class),
            @Result(property = "type", column = "type", javaType = Integer.class)
    })
    List<SubjectEntity> getByType(@Param("isParty") Boolean isParty, @Param("type") Integer type);
}
