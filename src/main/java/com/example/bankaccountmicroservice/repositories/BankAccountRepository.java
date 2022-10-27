package com.example.bankaccountmicroservice.repositories;

import com.example.bankaccountmicroservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {

}