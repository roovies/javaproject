package com.kh.practice;

import java.util.Scanner;

public class practice3 {
	public static void main(String[] args) {
		// Ű����� ���� �� ���� �Է� �޾� ���� ����(num1, num2)�� �����ϼ���.
		// �׸��� �� �ٸ� ������ �Է� �޾� �� ���� num1 ���ϰų� num2 �ʰ��̸� true�� ����ϰ�
		// �ƴϸ� false�� ����ϼ���. (��, num1�� num2���� �۾ƾ� ��)
		
		Scanner scan = new Scanner(System.in);
		int num1, num2, num3;
		do {
			System.out.print("����1 �Է�: ");
			num1 = scan.nextInt();
			System.out.print("����2 �Է�: ");
			num2 = scan.nextInt();
		}while(num1>num2);
		
		System.out.print("���� ���� �Է�: ");
		num3 = scan.nextInt();
		
		if((num3<=num1) || (num3>num2)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
