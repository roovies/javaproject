package com.kh.practice;

import java.util.Scanner;

public class practice3 {
	public static void main(String[] args) {
		// 키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
		// 그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
		// 아니면 false를 출력하세요. (단, num1은 num2보다 작아야 함)
		
		Scanner scan = new Scanner(System.in);
		int num1, num2, num3;
		do {
			System.out.print("정수1 입력: ");
			num1 = scan.nextInt();
			System.out.print("정수2 입력: ");
			num2 = scan.nextInt();
		}while(num1>num2);
		
		System.out.print("비교할 정수 입력: ");
		num3 = scan.nextInt();
		
		if((num3<=num1) || (num3>num2)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
