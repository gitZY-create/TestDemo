package service;

import java.util.List;

import entity.Customer;

public interface CustService {
	List<Customer> getAllCust();
	//��ӿͻ�
	boolean insertCust(Customer cust);
	//�ж����֤
	boolean pdCustCf(String custNumber,String custIdCard);
}
