package com.kh.day03;

import java.util.Scanner;

public class Menu {
	public static void main(String [] args) {
		// Switch���� ����Ͽ� �޴���ȣ�� ���弼��.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("0. ����");
		
		System.out.print("�޴� ��ȣ�� �Է��ϼ���: ");
		int num = scan.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("�Է¸޴��Դϴ�.");
			break;
		case 2:
			System.out.println("�����޴��Դϴ�.");
			break;
		case 3:
			System.out.println("��ȸ�޴��Դϴ�.");
			break;
		case 4:
			System.out.println("�����޴��Դϴ�.");
			break;
		case 0:
			System.out.println("�����߽��ϴ�.");
			break;
		default:
			System.out.println("��ȣ�� �߸� �����̽��ϴ� �����մϴ�.");
			break;
		}
	}
}
