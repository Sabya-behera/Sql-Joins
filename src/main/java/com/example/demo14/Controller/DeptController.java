package com.example.demo14.Controller;


import com.example.demo14.Model.Dept;
import com.example.demo14.Service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    DeptService deptService;

    @GetMapping("/get2")
    public List<Dept> getAllDept()
    {
        return deptService.getAllDept();
    }

    @PostMapping("/post2")
    public Dept addDept(@RequestBody Dept dept)
    {
        return deptService.addDept(dept);
    }

}
