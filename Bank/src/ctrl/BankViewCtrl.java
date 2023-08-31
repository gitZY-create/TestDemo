package ctrl;

import java.util.Scanner;

import service.AdminService;
import serviceImpl.AdminServiceImpl;
import view.AdminView;

public class BankViewCtrl {
	private AdminService adminService = new AdminServiceImpl();
	
	public void bankViewCtrl(Scanner scanner,String num) {
		if("1".equals(num)) {
			adminLogin(scanner,num);
		}else if ("2".equals(num)) {
			custLogin(scanner,num);
		}
	}
	
	private void adminLogin(Scanner scanner,String num) {
		System.out.println("请输入用户名：");
		String adminNumber = scanner.next();
		System.out.println("请输入密码：");
		String adminPwd = scanner.next();
		boolean bo = adminService.pdAdminNandP(adminNumber, adminPwd);
		if(bo) {
			AdminView adminView = new AdminView();
			adminView.adminView(scanner);
		}else {
			System.out.println("用户名或密码错误，请重新输入！");
		}
	}
	
	private void custLogin(Scanner scanner,String num) {
		
	}
}
