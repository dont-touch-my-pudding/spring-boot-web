package com.pudding.dao;

import com.pudding.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

// 部门dao
@Repository
public class DepartmentDao {
    // 模拟数据库中的数据
    private static Map<Integer, Department> department = null;

    static {
        department = new HashMap<Integer, Department>(); // 创建部门表
        department.put(101, new Department(101, "教学部"));
        department.put(102, new Department(102, "市场部"));
        department.put(103, new Department(103, "教研部"));
        department.put(104, new Department(104, "运营部"));
        department.put(105, new Department(105, "后勤部"));
    }

    // 获取所有部门消息
    public Collection<Department> getDepartment() {
        return department.values();
    }

    // 通过id获取部门
    public Department getDepartment(Integer id) {
        return department.get(id);
    }
}
