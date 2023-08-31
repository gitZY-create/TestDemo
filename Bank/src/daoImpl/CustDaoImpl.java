package daoImpl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.CustDao;
import entity.Customer;
import utile.JDBCUTILE;

public class CustDaoImpl implements CustDao {

	@Override
	public List<Customer> getAllCust() {
		String SQL="SELECT * FROM customer ORDER BY custMoney DESC";
		ResultSet rst=null;
		List<Customer> custList=new ArrayList<Customer>();
		try {
			rst=JDBCUTILE.selectDataBaseTable(SQL);
			while(rst.next()) {
				Customer cust=new Customer(
						rst.getString("custNumber"), 
						rst.getString("custName"), 
						rst.getString("custPwd"), 
						rst.getString("custIdCard"), 
						rst.getDouble("custMoney"), 
						rst.getString("custDate")
				);
				custList.add(cust);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				JDBCUTILE.dataBaseClose(rst, null, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return custList;
	}

	@Override
	public boolean insertCust(Customer cust) {
		String SQL="INSERT INTO customer VALUES(?,?,?,?,?,?)";
		boolean bo=false;
		try {
			bo=JDBCUTILE.upDataBaseTable(
					SQL, 
					cust.getCustNumber(),
					cust.getCustName(),
					cust.getCustPwd(),
					cust.getCustIdCard(),
					cust.getCustMoney(),
					cust.getCustDate()
					);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bo;
	}
	
}
