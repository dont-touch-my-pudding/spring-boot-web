package com.pudding.mapper;

import com.pudding.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {
    List<Employee> selectAll();

    Employee selectById(int id);

    int add(Employee employee);

    int delete(int id);

    int update(Employee employee);
}
