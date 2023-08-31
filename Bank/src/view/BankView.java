package view;

import java.util.Scanner;

import ctrl.BankViewCtrl;

public class BankView {
	private Scanner scanner = new Scanner(System.in);
	public void bankView() {
		while(true) {
			System.out.println("------银行系统------");
			System.out.println("******1.管理员******");
			System.out.println("******2.顾客******");
			System.out.println("请选择您需要的序号：");
			String num = scanner.next();
			BankViewCtrl bankViewCtrl = new BankViewCtrl();
		}
	}
}
