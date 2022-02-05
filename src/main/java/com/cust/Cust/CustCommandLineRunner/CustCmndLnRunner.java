package com.cust.Cust.CustCommandLineRunner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cust.Cust.Model.Cust;
import com.cust.Cust.Service.CustService;

@Component
public class CustCmndLnRunner implements CommandLineRunner{
	
	@Autowired
	CustService custService;
	
	@Override
	public void run(String... args) throws Exception{
		
		custService.addCust(new Cust(100, "Bob", 32));
		custService.addCust(new Cust(101, "Hani", 27));
		custService.addCust(new Cust(102, "Abe", 33));
		custService.addCust(new Cust(103, "Xavi", 30));
		
	}

}
