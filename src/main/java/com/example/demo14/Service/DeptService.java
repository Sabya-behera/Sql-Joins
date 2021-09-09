package com.example.demo14.Service;
import java.util.List;

import com.example.demo14.Model.Dept;
import com.example.demo14.Model.Emp;
import com.example.demo14.Repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DeptService {
    @Autowired
    DeptRepository  deptRepository;

    public List<Dept> getAllDept() {
        return deptRepository.findAll();
    }

    public Dept addDept(Dept dept) {
        return deptRepository.save(dept);
    }
}