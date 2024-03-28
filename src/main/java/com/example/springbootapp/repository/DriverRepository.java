package com.example.springbootapp.repository;

import com.example.springbootapp.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DriverRepository extends JpaRepository<Driver, Long> {
    Driver findByEmpId(Long id);
    List<Driver> deleteByName(String name);
}
