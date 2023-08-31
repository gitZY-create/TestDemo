package view;

import java.util.Scanner;

public class CustView {
	public void custView(Scanner scanner) {
		while(true) {
			System.out.println("银行系统【顾客】");
			System.out.println("*************");
			System.out.println("1.存款");
			System.out.println("2.取款");
			System.out.println("3.查询余额");
			System.out.println("4.转账");
			System.out.println("5.修改密码");
			System.out.println("6.退出");
			System.out.println("*************");
			System.out.println("请输入您想要的序号：");
			String num = scanner.next();
		}
	}
}
