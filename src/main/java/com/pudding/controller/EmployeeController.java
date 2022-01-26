package com.pudding.controller;

import com.pudding.mapper.DepartmentMapper;
import com.pudding.dao.EmployeeDao;
import com.pudding.mapper.EmployeeMapper;
import com.pudding.pojo.Department;
import com.pudding.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.List;

@Controller
public class EmployeeController {
//    @Autowired
//    public EmployeeDao employeeDao;
    @Autowired
    private DepartmentMapper DepartmentMapper;
    @Autowired
    private EmployeeMapper employeeMapper;


    @RequestMapping("/list")
    public String list(Model model) {
        Collection<Employee> employees = employeeMapper.selectAll();
        model.addAttribute("DepartmentMapper",DepartmentMapper);
        model.addAttribute("emps", employees);
        return "list";
    }

    @GetMapping("/toAdd")
    public String toAddPage(Model model) {
        model.addAttribute("departments", DepartmentMapper.selectAll());
        return "add";
    }

    @PostMapping("/toAdd")
    public String add(Employee employee) {
        employeeMapper.add(employee);
        return "redirect:/list";
    }

    @GetMapping("/update")
    public String toUpDatePage(Integer id, Model model) {
        Employee employee = employeeMapper.selectById(id);
        model.addAttribute("employee", employee);
        model.addAttribute("departments", DepartmentMapper.selectAll());
        return "update";
    }
    @PostMapping("/update")
    public String update(Employee employee){
        System.out.println(employee);
        employeeMapper.update(employee);
        return "redirect:/list";
    }
    @GetMapping("/remove")
    public String remove(Integer id){
        employeeMapper.delete(id);
        return "redirect:/list";
    }
}
