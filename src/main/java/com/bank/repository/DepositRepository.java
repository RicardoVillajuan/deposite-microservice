package com.bank.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bank.model.Deposit;



public interface DepositRepository  extends ReactiveMongoRepository<Deposit, String>{

}
