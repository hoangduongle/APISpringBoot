package com.example.apispringboot.repository;

import com.example.apispringboot.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer> {
    public Account findByUsername(String userName);
    public Account findByFullName(String fullName);
    public Account findByUsernameAndPassword(String username, String password);

}
