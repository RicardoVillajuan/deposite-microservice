package com.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.bank.model.Deposit;
import com.bank.servis.IDepositService;


import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/deposits")
public class RetreatController {
	private final IDepositService service;
	@GetMapping("/findAll")
	public Flux<Deposit> getRetreat(){
		
		return service.findAll();
	}
	
	@PostMapping("/save")
	Mono<Deposit> postClient(@RequestBody Deposit retreat)
	{
		return service.save(retreat);
	}
	@PostMapping("/update")
	public Mono<Deposit> saveProduct(@RequestBody Deposit retreat){
		
		return service.save(retreat);
	}
	
	@PostMapping("/delete/{id}")
	void deleteProduct(@PathVariable String id){
		
		service.deleteById(id);
	}
	
	@GetMapping("/findbyid/{id}")
	public Mono<Deposit> findById(@PathVariable String id){
		return service.findDepositById(id);
	}

}
