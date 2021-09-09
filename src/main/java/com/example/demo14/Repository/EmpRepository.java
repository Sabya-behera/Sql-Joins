package com.example.demo14.Repository;

import com.example.demo14.Model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Emp,Long> {
}
