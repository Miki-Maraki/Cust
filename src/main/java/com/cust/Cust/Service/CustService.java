
package com.cust.Cust.Service;

import java.util.Optional;

import com.cust.Cust.Model.Cust;

public interface CustService {
	
	public Iterable<Cust> getAllCust();
	
	public void addCust(Cust cust);
	
	public Optional<Cust> getCustById(long id);
	
	public Optional<Cust> deleteCustById(long id);
	

}
