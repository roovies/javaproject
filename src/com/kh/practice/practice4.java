package com.kh.practice;

import java.util.Scanner;

public class practice4 {
	public static void main(String[] args) {
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
