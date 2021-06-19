package com.example.apispringboot.apiController;

import com.example.apispringboot.entity.Account;
import com.example.apispringboot.repository.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //restFULL api
@CrossOrigin
public class AccountAPI {

    @Autowired
    AccountRepo accountRepo;

    @PostMapping("/account/create")
    public ResponseEntity<?> create(@RequestBody Account acc) {
        accountRepo.save(acc);
        Account accNew = accountRepo.findByUsername(acc.getUsername());
        return ResponseEntity.ok(accNew);
    }

    @GetMapping("/account/list")
    public ResponseEntity<?> getList(){
        List<Account> list = accountRepo.findAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping("account/login")
    public ResponseEntity<?> checkLogin(@RequestBody Account acc){
        Account accNew = accountRepo.findByUsernameAndPassword(acc.getUsername(),acc.getPassword());
        return ResponseEntity.ok(accNew);
    }

}
