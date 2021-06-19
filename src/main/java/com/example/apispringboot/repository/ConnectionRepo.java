package com.example.apispringboot.repository;

import com.example.apispringboot.entity.Connection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnectionRepo extends JpaRepository<Connection, Integer> {

}
