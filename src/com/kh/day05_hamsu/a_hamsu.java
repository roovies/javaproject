package com.kh.day05_hamsu;

import java.util.Scanner;

public class a_hamsu {
	//3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
	public void hamsu1() {
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
	
	public void hamsu2() {
		// 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 하나를 입력하세요: ");
		int input = scan.nextInt();
		if(input>0) {
			System.out.println("양수다");
		}
		else if (input==0) {
			System.out.println("0이다");
		}
		else {
			System.out.println("양수가 아니다");
		}
	}
}
