package com.kh.day03;

import java.util.Scanner;

public class e_Calculator_by_if {
	public static void main(String [] args) {
		// IF문을 사용하여 2개의 정수를 입력받고, 연산자를 입력받아서 계산하는 계산기 프로그램을 작성하라.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요: ");
		int num1 = scan.nextInt();
		System.out.print("정수를 한 번 더 입력해주세요: ");
		int num2 = scan.nextInt();
		System.out.print("연산자를 입력해주세요. (+,-,*,/,%)");
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
		System.out.println("결과: "+num1+operator+num2+" = "+result);
	}
}
