package entity;

public class Customer {
	String custNumber;
	String custName;
	String custPwd;
	String custIdCard;
	Double custMoney;
	String custDate;
	public Customer() {
		super();
	}
	public Customer(String custNumber, String custName, String custPwd, String custIdCard, Double custMoney,
			String custDate) {
		super();
		this.custNumber = custNumber;
		this.custName = custName;
		this.custPwd = custPwd;
		this.custIdCard = custIdCard;
		this.custMoney = custMoney;
		this.custDate = custDate;
	}
	public String getCustNumber() {
		return custNumber;
	}
	public void setCustNumber(String custNumber) {
		this.custNumber = custNumber;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustPwd() {
		return custPwd;
	}
	public void setCustPwd(String custPwd) {
		this.custPwd = custPwd;
	}
	public String getCustIdCard() {
		return custIdCard;
	}
	public void setCustIdCard(String custIdCard) {
		this.custIdCard = custIdCard;
	}
	public Double getCustMoney() {
		return custMoney;
	}
	public void setCustMoney(Double custMoney) {
		this.custMoney = custMoney;
	}
	public String getCustDate() {
		return custDate;
	}
	public void setCustDate(String custDate) {
		this.custDate = custDate;
	}
	@Override
	public String toString() {
		return "Customer [custNumber=" + custNumber + ", custName=" + custName + ", custPwd=" + custPwd
				+ ", custIdCard=" + custIdCard + ", custMoney=" + custMoney + ", custDate=" + custDate + "]";
	}
}
