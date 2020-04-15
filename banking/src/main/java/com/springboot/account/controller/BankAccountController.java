package com.springboot.account.controller;

import java.util.List;


import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.account.model.BankAccount;
import com.springboot.account.repository.BankAccountRepository;
import com.springboot.account.exception.DBException;
import com.springboot.account.exception.AccountNotFoundException;

@RestController
@RequestMapping("/account")
public class BankAccountController {

	@Autowired 
	private BankAccountRepository repository;




	@GetMapping("/accounts")
	public List<BankAccount> getAllBankAccounts(){
		return repository.findAll();
	}


	@GetMapping("/accounts/{id}")
	public Optional<BankAccount> getBankAccountsById(@PathVariable int id){
		return repository.findById(id);
	}


	@PostMapping("/accounts")
	public BankAccount saveBankAccounts(@RequestBody BankAccount account){
		return repository.save(account);
	}



	@DeleteMapping("/accounts")
	public List<BankAccount> deleteAllBankAccounts(){
		return repository.findAll();
	}


	@DeleteMapping("accs/{id}")
	public List<BankAccount> deleteBankAccountByID(@RequestBody BankAccount e, @PathVariable int id){
		return repository.findAll();
	}


}

