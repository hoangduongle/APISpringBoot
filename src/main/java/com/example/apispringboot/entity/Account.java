package com.example.apispringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data //get set
@AllArgsConstructor //khoi tao constructor
@NoArgsConstructor //khoi tao constructor empty
public class Account {
    @Id
    @GeneratedValue
    public int id;
    public String fullName;
    public String avatar;
    public String role;
    public String gender;
    public String password;
}