package com.example.springbootapp.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empId;
    private String name;
    private Integer age;
    private String region;
    private Double salary=Math.random()*100000;
    @Column(name = "PhoneNumber")
    private  Long phoneNumber = (long)(Math.random()*Math.pow(10,10));


}
