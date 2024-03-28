package com.example.springbootapp.service;

import com.example.springbootapp.entity.Driver;
import com.example.springbootapp.repository.DriverRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {

    @Autowired
    DriverRepository driverRepository;



    public List<Driver> saveDriverData(List<Driver> driverList){
        return driverRepository.saveAll(driverList);

    }
    public List<Driver> getDriver(){
        return driverRepository.findAll();
    }

    public Driver getDriverById(Long empId){
        return driverRepository.findByEmpId(empId);
    }
    @Transactional
    public List<Driver> deleteDriverByName(String name){
        return driverRepository.deleteByName(name);

    }
}
