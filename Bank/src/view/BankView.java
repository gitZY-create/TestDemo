package view;

import java.util.Scanner;

import ctrl.BankViewCtrl;

public class BankView {
	private Scanner scanner = new Scanner(System.in);
	public void bankView() {
		while(true) {
			System.out.println("------����ϵͳ------");
			System.out.println("******1.����Ա******");
			System.out.println("******2.�˿�******");
			System.out.println("��ѡ������Ҫ����ţ�");
			String num = scanner.next();
			BankViewCtrl bankViewCtrl = new BankViewCtrl();
		}
	}
}
