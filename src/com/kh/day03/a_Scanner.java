package com.kh.day03;

import java.util.Scanner;

public class a_Scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//����
		String name;
		int month;
		double height;
		String sex;
		String addr;
		
		//�Է°� �ޱ�
		System.out.print("�̸��� �Է����ּ���: ");
		name = scan.next();
		System.out.println("�Է��Ͻ� �̸��� "+name+"�Դϴ�.");

		scan.nextLine();
		System.out.print("�ּҸ� �Է����ּ���: ");
		addr = scan.nextLine();
		System.out.println("�Է��Ͻ� �ּҴ� "+addr+"�Դϴ�.");
		
	}
}
		/*
		System.out.print("�¾ ���� �Է����ּ���: ");
		month = scan.nextInt();
		System.out.println("�Է��Ͻ� ���� "+month+"�Դϴ�.");
		
		System.out.print("Ű�� �Է����ּ���: ");
		height = scan.nextDouble();
		System.out.println("�Է��Ͻ� Ű�� "+height+"�Դϴ�.");
		
		System.out.print("������ �Է����ּ���: ");
		sex = scan.next();
		System.out.println("�Է��Ͻ� ������ "+sex+"�Դϴ�.");
		*/
		//scan.nextLine();
