package com.bank.servis;



import com.bank.model.Deposit;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IDepositService {
	Flux<Deposit> findAll();
	
	Mono<Deposit> save(Deposit deposit);
	
	Mono<Deposit> findDepositById(String id);
	
	Mono<Deposit> update(Deposit deposit);
	
	void deleteById(String id);
}
