package serviceImpl;

import java.util.List;

import dao.CustDao;
import daoImpl.CustDaoImpl;
import entity.Customer;
import service.CustService;

public class CustServiceImpl implements CustService {

	private CustDao custDao = new CustDaoImpl();
	
	@Override
	public List<Customer> getAllCust() {
		return custDao.getAllCust();
	}

	@Override
	public boolean insertCust(Customer cust) {
		return custDao.insertCust(cust);
	}

	@Override
	public boolean pdCustCf(String custNumber, String custIdCard) {
		List<Customer> custList=custDao.getAllCust();
		boolean bo=true;
		if(custList.size()>0) {
			for(Customer cust:custList) {
				if(cust.getCustNumber().equals(custNumber)||cust.getCustIdCard().equals(custIdCard)) {
					bo=false;
					break;
				}
			}
		}		
		return bo;
	}
	
}
