package com.kh.practice;

import java.util.Scanner;

public class practice2 {
	public static void main (String [] args) {
		//3���� ���� Ű����� �Է� �޾� �Է� ���� ���� ��� ������ true, �ƴϸ� false�� ����ϼ���.
		
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
}
