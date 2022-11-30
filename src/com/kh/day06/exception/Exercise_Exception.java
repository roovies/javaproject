package com.kh.day06.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {
	public static void main(String[] args) {
	//예외처리 반복문
//		while(true) {
//			try {
//				Scanner sc = new Scanner(System.in);
//				System.out.print("정수 하나 입력: ");
//				int num1 = sc.nextInt();
//				System.out.print("정수 하나 더 입력: ");
//				int num2 = sc.nextInt();
//				int result = num1/num2;
//				System.out.println("두 수를 나눈 몫은 "+result+"입니다.");
//				break;
//			}
//			catch(ArithmeticException e) {
//				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
//			}
//		}
		System.out.print("정수입력1: ");
		Scanner scan = new Scanner(System.in);
		int num11 = scan.nextInt();
		
		while(true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("정수입력1: ");
				int num1 = sc.nextInt();
				System.out.print("정수입력2: ");
				int num2 = sc.nextInt();
				System.out.print("정수입력3: ");
				int num3 = sc.nextInt();
				System.out.println("세 수의 합: "+(num1+num2+num3));
				System.out.println("1,2번째 입력한 수의 나누기: "+num1/num2);
			}
			catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요.");
			}
		}
	}
}
