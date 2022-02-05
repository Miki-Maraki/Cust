
package com.cust.Cust.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cust.Cust.Model.Cust;
import com.cust.Cust.Repository.CustRepository;
import com.cust.Cust.Service.CustService;

@Service
public class CustServiceImpl implements CustService{  // business layer
	
	@Autowired
	CustRepository custRepository;
	
	@Override
	public Iterable<Cust> getAllCust(){
		return custRepository.findAll();
	}
	@Override
	public void addCust(Cust cust) {
		custRepository.save(cust);
	}
	@Override
	public Optional<Cust> getCustById(long id){
		return custRepository.findById(id);
	}
	@Override
	public Optional<Cust> deleteCustById(long id){
		custRepository.deleteById(id);
		Optional<Cust> od = Optional.empty();
		return od;
	}
}








