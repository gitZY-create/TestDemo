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
		System.out.println("�������û�����");
		String adminNumber = scanner.next();
		System.out.println("���������룺");
		String adminPwd = scanner.next();
		boolean bo = adminService.pdAdminNandP(adminNumber, adminPwd);
		if(bo) {
			AdminView adminView = new AdminView();
			adminView.adminView(scanner);
		}else {
			System.out.println("�û���������������������룡");
		}
	}
	
	private void custLogin(Scanner scanner,String num) {
		
	}
}
