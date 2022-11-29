package com.kh.practice;

import java.util.Scanner;

public class practice1 {
	public static void main(String[] args) {
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("1이상의 정수 하나를 입력하세요: ");
			int input = scan.nextInt();
			int temp = input;
			if(input<1) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				continue;
			}
			System.out.println("입력하신 숫자: "+input);
			for(int i=0; i<input; i++) {
				System.out.print(temp+" ");
				temp--;
			}
			break;
		}
	}
}
