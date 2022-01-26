package com.pudding.mapper;

import com.pudding.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
@Repository
public interface DepartmentMapper {
    List<Department> selectAll();

    Department selectById(int id);
}
