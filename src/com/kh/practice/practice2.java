package com.kh.practice;

import java.util.Scanner;

public class practice2 {
	public static void main (String [] args) {
		//3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력1: ");
		int input1 = scan.nextInt();
		System.out.print("입력2: ");
		int input2 = scan.nextInt();
		System.out.print("입력3: ");
		int input3 = scan.nextInt();

		if((input1==input2)&&(input1==input3)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
