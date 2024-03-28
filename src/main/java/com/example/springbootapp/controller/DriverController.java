package com.example.springbootapp.controller;


import com.example.springbootapp.entity.Driver;
import com.example.springbootapp.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DriverController {

    @Autowired
    DriverService driverService;

    @PostMapping("/saveDrivers")
    public List<Driver> saveDrivers(@RequestBody List<Driver> driverList){
        return driverService.saveDriverData(driverList);

    }

    @GetMapping("/getDriver")
    public List<Driver> getDrivers(){
        return driverService.getDriver();
    }

    @GetMapping("/getDriverById/{empId}")
    public Driver getDrivers(@PathVariable Long empId){
        return driverService.getDriverById(empId);
    }

    @DeleteMapping("deleteDriverByName/{name}")
    public List<Driver> deleteDriverByName(@PathVariable String name){
        return driverService.deleteDriverByName(name);
    }

}
