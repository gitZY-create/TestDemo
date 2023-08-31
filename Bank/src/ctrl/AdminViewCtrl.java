package ctrl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entity.Customer;
import service.CustService;
import serviceImpl.CustServiceImpl;

public class AdminViewCtrl {
	private CustService custService = new CustServiceImpl();
	
	public void adminView(Scanner scanner,String num) {
		if("1".equals(num)) {
			insertCust(scanner);
		}else if("2".equals(num)) {
			getAllMoney(scanner);
		}else if("3".equals(num)) {
			inOrder();
		}else if("4".equals(num)) {
			System.out.println("欢迎下次光临！");
			System.exit(0);
		}
	}
	private void insertCust(Scanner scanner) {
		while(true) {
			System.out.println("请输入顾客银行卡号：");
			String custNumber = scanner.next();
			System.out.println("请输入顾客姓名：");
			String custName = scanner.next();
			System.out.println("请输入顾客身份证：");
			String custIdCard = scanner.next();
			System.out.println("请输入顾客开户金额：");
			Double custMoney = scanner.nextDouble();
			System.out.print("请输入初始密码：");
			String custPwd=scanner.next();
			boolean bo=custService.pdCustCf(custNumber, custIdCard);
			if(bo) {
				Date date=new Date();
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				String custDate = simpleDateFormat.format(date);
				Customer cust=new Customer(custNumber, custName, custPwd, custIdCard, custMoney, custDate);
				//调用添加用户到数据库的方法
				boolean boo=custService.insertCust(cust);
				if(boo) {
					System.out.println("添加成功");
					break;
				} else {
					System.out.println("顾客添加失败！请重新输入！");
				}
			} else {
				System.out.println("银行卡号或身份证号错误！请重新输入！");
			}
		}
	}
	//计算储蓄总额
	private void getAllMoney(Scanner scanner) {
		List<Customer> custList=custService.getAllCust();
		Double allMoney=0.0;
		for(Customer cust:custList) {
			allMoney+=cust.getCustMoney();
		}
		System.out.println("当前存款总额为："+allMoney);
	}
	//富豪排行榜
	private void inOrder() {
		List<Customer> custList=custService.getAllCust();
		System.out.println("名次\t姓名\t身份证号码\t金额");
		int i=0;
		for(Customer cust:custList) {
			System.out.println((++i)+"\t"+cust.getCustName()+"\t"+cust.getCustIdCard()+"\t"+cust.getCustMoney());
		}
	}
}
