package com.example.apispringboot.apiController;

import com.example.apispringboot.entity.Account;
import com.example.apispringboot.repository.AccountRepo;
import com.example.apispringboot.repository.ConnectionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //restFULL api
public class AccountAPI {

    @Autowired
    AccountRepo accountRepo;

    @PostMapping("/account/create")
    public ResponseEntity<?> create(@RequestBody Account acc) {
        accountRepo.save(acc);
        Account accNew = accountRepo.findById(acc.getId());
        return ResponseEntity.ok(accNew);
    }

    @PostMapping("/account/list")
    public List<Account> getList(){
        List<Account> list = accountRepo.findAll();
        return list;
    }
}
