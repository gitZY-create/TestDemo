package service;

import java.util.List;

import entity.Customer;

public interface CustService {
	List<Customer> getAllCust();
	//添加客户
	boolean insertCust(Customer cust);
	//判断身份证
	boolean pdCustCf(String custNumber,String custIdCard);
}
