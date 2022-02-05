package com.cust.Cust.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cust.Cust.Model.Cust;
import com.cust.Cust.Service.CustService;

@RestController
@RequestMapping("/api")
public class CustController {
	
	@Autowired
	CustService custService;
	
	@GetMapping("/Customers")
	public Iterable<Cust> getAllCust(){
		return custService.getAllCust();
	}
	
	@PostMapping("/add/{cust}")
	public List<Cust> addCust(@RequestBody Cust cust) {
		custService.addCust(cust);
		Iterable<Cust> ic = custService.getAllCust();
		List<Cust> lst = new ArrayList<>();
		for(Cust c:ic) {
			lst.add(c);
		}
		return lst;
	}
	
	@GetMapping("/byid/{id}")
	public Optional<Cust> getCustById(@PathVariable long id){
		
		return custService.getCustById(id);
	}
	
	@DeleteMapping("/del/{id}")
	public Optional<Cust> deleteCustById(@PathVariable long id){
		return custService.deleteCustById(id);
	}

}
