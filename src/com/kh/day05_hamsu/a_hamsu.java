package com.kh.day05_hamsu;

import java.util.Scanner;

public class a_hamsu {
	//3���� ���� Ű����� �Է� �޾� �Է� ���� ���� ��� ������ true, �ƴϸ� false�� ����ϼ���.
	public void hamsu1() {
		Scanner scan = new Scanner(System.in);
		System.out.print("�Է�1: ");
		int input1 = scan.nextInt();
		System.out.print("�Է�2: ");
		int input2 = scan.nextInt();
		System.out.print("�Է�3: ");
		int input3 = scan.nextInt();
		
		if((input1==input2)&&(input1==input3)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	
	public void hamsu2() {
		// Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�, ����� �ƴϸ� ������� �ƴϴ١��� ����ϼ���.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �ϳ��� �Է��ϼ���: ");
		int input = scan.nextInt();
		if(input>0) {
			System.out.println("�����");
		}
		else if (input==0) {
			System.out.println("0�̴�");
		}
		else {
			System.out.println("����� �ƴϴ�");
		}
	}
}
