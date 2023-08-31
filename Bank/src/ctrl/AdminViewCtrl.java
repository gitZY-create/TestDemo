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
			System.out.println("��ӭ�´ι��٣�");
			System.exit(0);
		}
	}
	private void insertCust(Scanner scanner) {
		while(true) {
			System.out.println("������˿����п��ţ�");
			String custNumber = scanner.next();
			System.out.println("������˿�������");
			String custName = scanner.next();
			System.out.println("������˿����֤��");
			String custIdCard = scanner.next();
			System.out.println("������˿Ϳ�����");
			Double custMoney = scanner.nextDouble();
			System.out.print("�������ʼ���룺");
			String custPwd=scanner.next();
			boolean bo=custService.pdCustCf(custNumber, custIdCard);
			if(bo) {
				Date date=new Date();
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				String custDate = simpleDateFormat.format(date);
				Customer cust=new Customer(custNumber, custName, custPwd, custIdCard, custMoney, custDate);
				//��������û������ݿ�ķ���
				boolean boo=custService.insertCust(cust);
				if(boo) {
					System.out.println("��ӳɹ�");
					break;
				} else {
					System.out.println("�˿����ʧ�ܣ����������룡");
				}
			} else {
				System.out.println("���п��Ż����֤�Ŵ������������룡");
			}
		}
	}
	//���㴢���ܶ�
	private void getAllMoney(Scanner scanner) {
		List<Customer> custList=custService.getAllCust();
		Double allMoney=0.0;
		for(Customer cust:custList) {
			allMoney+=cust.getCustMoney();
		}
		System.out.println("��ǰ����ܶ�Ϊ��"+allMoney);
	}
	//�������а�
	private void inOrder() {
		List<Customer> custList=custService.getAllCust();
		System.out.println("����\t����\t���֤����\t���");
		int i=0;
		for(Customer cust:custList) {
			System.out.println((++i)+"\t"+cust.getCustName()+"\t"+cust.getCustIdCard()+"\t"+cust.getCustMoney());
		}
	}
}
