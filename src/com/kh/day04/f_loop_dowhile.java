package com.kh.day04;

import java.util.Scanner;

public class f_loop_dowhile {
	public static void main(String[] args) {
		// do while문을 사용하여 -1이 입력될 때까지 정수를 입력받고, 1이 입력되면 입력한 수의 합과 평균을 구하시오.
		
		Scanner scan = new Scanner(System.in);
		
		int input = 0;
		int sum = 0;
		do {
			System.out.print("정수 입력: ");
			input = scan.nextInt();
			if(input==-1) {
				break;
			}
			sum += input;
		} while(true);
		
		System.out.println("입력하신 수의 합: "+sum);
	}
}
