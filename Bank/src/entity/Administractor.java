package entity;

public class Administractor {
	String adminNumber;
	String adminPwd;
	String adminName;
	public Administractor() {
		super();
	}
	public Administractor(String adminNumber, String adminPwd, String adminName) {
		super();
		this.adminNumber = adminNumber;
		this.adminPwd = adminPwd;
		this.adminName = adminName;
	}
	public String getAdminNumber() {
		return adminNumber;
	}
	public void setAdminNumber(String adminNumber) {
		this.adminNumber = adminNumber;
	}
	public String getAdminPwd() {
		return adminPwd;
	}
	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	@Override
	public String toString() {
		return "Administractor [adminNumber=" + adminNumber + ", adminPwd=" + adminPwd + ", adminName=" + adminName
				+ "]";
	}
}