package com.example.demo14.Controller;


import com.example.demo14.Model.Emp;
import com.example.demo14.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    EmpService empService;

    @GetMapping("/get")
    public List<Emp> getAllEmp()
    {
        return empService.getAllEmp();
    }

    @PostMapping("/post")
    public Emp addEmp(@RequestBody Emp emp)
    {
        return empService.addEmp(emp);
    }

}

