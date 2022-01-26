package com.pudding.dao;

import com.pudding.pojo.Department;
import com.pudding.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class EmployeeDao {
//    // 模拟数据库中的数据
//    private static Map<Integer, Employee> employees = null;
//    @Autowired
//    private DepartmentDao departmentDao;
//
//    static {
//        employees = new HashMap<Integer, Employee>(); // 创建部门表
//        employees.put(1001, new Employee(1001, "AA", "2048288153@QQ.com", 1, new Department(101, "教学部"), new Date()));
//        employees.put(1002, new Employee(1002, "BB", "2048288153@QQ.com", 0, new Department(102, "市场部"), new Date()));
//        employees.put(1003, new Employee(1003, "CC", "2048288153@QQ.com", 1, new Department(103, "教研部"), new Date()));
//        employees.put(1004, new Employee(1004, "DD", "2048288153@QQ.com", 0, new Department(104, "运营部"), new Date()));
//        employees.put(1005, new Employee(1005, "EE", "2048288153@QQ.com", 1, new Department(105, "后勤部"), new Date()));
//    }
//
//    private static Integer initId = 1006;
//
//    // 增加一个员工
    public void add(Employee employee) {

//        if (employee.getId() == null) {
//            employee.setId(initId++);
//        }
//        employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getId()));
//        employees.put(employee.getId(), employee);
    }

    // 查询全部员工信息
    public Collection<Employee> selectAll() {
//        return employees.values();
        return null;
    }

    // 通过id查询员工
    public Employee selectById(Integer id) {
//        return employees.get(id);
        return null;
    }

    // 删除员工
    public void delete(Integer id){
//        employees.remove(id);
    }
}
