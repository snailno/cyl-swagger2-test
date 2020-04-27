package com.cyl.springboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author Administrator
 * @Date 2020/4/24 18:21
 * @Version 1.0
 */
@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private double money;
}
