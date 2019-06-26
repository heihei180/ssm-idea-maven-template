package com.test.model;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestTableMapper {
    int deleteByPrimaryKey(Integer testId);

    int insert(TestTable record);

    int insertSelective(TestTable record);

    TestTable selectByPrimaryKey(Integer testId);

    int updateByPrimaryKeySelective(TestTable record);

    int updateByPrimaryKey(TestTable record);
}