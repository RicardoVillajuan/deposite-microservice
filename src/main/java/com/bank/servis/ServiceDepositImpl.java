package com.bank.servis;


import org.springframework.stereotype.Service;

import com.bank.model.Deposit;
import com.bank.repository.DepositRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@RequiredArgsConstructor
@Service
public class ServiceDepositImpl implements IDepositService{
	private final DepositRepository repository;

	@Override
	public Flux<Deposit> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Mono<Deposit> save(Deposit deposit) {
		// TODO Auto-generated method stub
		return repository.save(deposit);
	}

	@Override
	public Mono<Deposit> findDepositById(String id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Mono<Deposit> update(Deposit deposit) {
		// TODO Auto-generated method stub
		return repository.save(deposit);
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		repository.deleteById(id).subscribe();
		
	}

	

}
