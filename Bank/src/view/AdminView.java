package view;

import java.util.Scanner;

import ctrl.AdminViewCtrl;

public class AdminView {
	public void adminView(Scanner scanner) {
		while(true) {
			System.out.println("银行系统【管理员】");
			System.out.println("*************");
			System.out.println("1.添加顾客");
			System.out.println("2.计算储蓄总额");
			System.out.println("3.富豪排行榜");
			System.out.println("4.退出");
			System.out.println("*************");
			System.out.println("请输入您想要的序号：");
			String num = scanner.next();
		}
	}
	
	
}
