package com.kh.day04;

import java.util.Scanner;

public class d_gugudan {
	public static void main(String[] args) {
		// 정수를 하나 입력받아서 그 수가 1~9 사이의 수일 때만, 그 수의 구구단을 출력하라.
		// 단 조건이 맞지 않으면 1~9 사이의 양수를 입력해야 합니다.를 출력하세요
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요: ");
		int input = scan.nextInt();
		
		if((input<1) || (input>9)) {
			System.out.println("1~9 사이의 양수를 입력해야 합니다.");
		}
		else {
			for(int i=1; i<10; i++) {
				System.out.println(input+"x"+i+"= "+input*i);
			}
		}
	}
	
}
