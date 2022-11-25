package com.kh.day03;

import java.util.Scanner;

public class d_If {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		//IF문을 이용하여 정수를 입력받아 짝수인지 홀수인지 판별하는 프로그램을 작성하라.
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		
		if(num%2==0) {
			System.out.println("입력하신 "+num+"값은 짝수입니다.");
		}
		else {
			System.out.println("입력하신 "+num+"값은 홀수입니다.");
		}
	}
}
