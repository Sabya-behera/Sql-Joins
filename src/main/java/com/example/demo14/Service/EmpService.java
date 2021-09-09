package com.example.demo14.Service;

import java.util.List;

import com.example.demo14.Model.Emp;
import com.example.demo14.Repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmpService {
    @Autowired
    EmpRepository empRepository;

    public List<Emp> getAllEmp() {
        return empRepository.findAll();
    }

    public Emp addEmp(Emp emp) {
        return empRepository.save(emp);
    }
}