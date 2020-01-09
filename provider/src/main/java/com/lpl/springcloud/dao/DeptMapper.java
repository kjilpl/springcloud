package com.lpl.springcloud.dao;

import com.lpl.springcloud.model.Dept;
import java.util.List;

public interface DeptMapper {
    int deleteByPrimaryKey(Long deptno);

    int insert(Dept record);

    Dept selectByPrimaryKey(Long deptno);

    List<Dept> selectAll();

    int updateByPrimaryKey(Dept record);
}