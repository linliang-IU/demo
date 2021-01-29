package com.example.testDemo.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Table;


@Data
@Table
@Entity
public class UserEntity extends SysEntity {
    private String userName;
    private String password;
    private String phone;
    private String email;
}
