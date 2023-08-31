package dao;

import java.util.List;

import entity.Customer;

public interface CustDao {
	List<Customer> getAllCust();
	boolean insertCust(Customer cust);
}
