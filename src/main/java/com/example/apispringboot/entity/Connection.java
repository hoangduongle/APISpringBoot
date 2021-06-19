package com.example.apispringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data //get set
@AllArgsConstructor //khoi tao constructor
@NoArgsConstructor //khoi tao constructor empty

public class Connection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    public String statusName;


}
