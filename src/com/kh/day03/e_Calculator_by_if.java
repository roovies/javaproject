package com.kh.day03;

import java.util.Scanner;

public class e_Calculator_by_if {
	public static void main(String [] args) {
		// IF���� ����Ͽ� 2���� ������ �Է¹ް�, �����ڸ� �Է¹޾Ƽ� ����ϴ� ���� ���α׷��� �ۼ��϶�.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ���: ");
		int num1 = scan.nextInt();
		System.out.print("������ �� �� �� �Է����ּ���: ");
		int num2 = scan.nextInt();
		System.out.print("�����ڸ� �Է����ּ���. (+,-,*,/,%)");
		char operator = scan.next().charAt(0);
		
		int result = 0;
		if(operator=='+') {
			result = num1+num2;
		}
		else if(operator=='-') {
			result = num1-num2;
		}
		else if(operator=='*') {
			result = num1*num2;
		}
		else if(operator=='/') {
			result = num1/num2;
		}
		else if(operator=='%') {
			result = num1%num2;
		}
		System.out.println("���: "+num1+operator+num2+" = "+result);
	}
}
