package com.example.apispringboot.apiController;


import com.example.apispringboot.entity.Connection;
import com.example.apispringboot.repository.ConnectionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //restFULL api
public class ConnectionController {

    @Autowired
    ConnectionRepo connectionRepo;


    @GetMapping("/testAPI")
    public ResponseEntity<?> CheckConnect() {
        connectionRepo.save(new Connection(1,"Connection"));

        List<Connection> list = connectionRepo.findAll();
        return ResponseEntity.ok(list); //return file
    }

}
