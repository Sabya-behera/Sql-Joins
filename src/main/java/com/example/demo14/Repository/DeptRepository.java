package com.example.demo14.Repository;

import com.example.demo14.Model.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepository extends JpaRepository<Dept,Long> {
}
