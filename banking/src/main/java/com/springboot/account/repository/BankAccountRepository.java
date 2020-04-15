package com.springboot.account.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.springboot.account.model.BankAccount;


@Repository

public interface BankAccountRepository extends JpaRepository <BankAccount,Integer> {

	

}
