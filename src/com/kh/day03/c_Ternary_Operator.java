package com.kh.day03;

import java.util.Scanner;

public class c_Ternary_Operator { //삼항연산자
	public static void main(String [] args) {
		//삼항연산자를 이용하여 정수를 입력받아 짝수인지 홀수인지 판별하는 프로그램을 작성하라.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num;
		num = scan.nextInt();
		String result;
		result = (num%2==0) ? "짝수":"홀수";
		System.out.println("입력한 "+num+"값은 "+result+"입니다.");
	}
}

