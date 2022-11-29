package com.kh.day04;

import java.util.Scanner;

public class e_loop_while {
	public static void main(String[] args) {
		// while문을 이용하여 1~100 사이의 홀수의 합을 출력하시오
		System.out.println("while문을 이용하여 1~100 사이의 홀수의 합을 출력하시오");
		int num = 1;
		int sum = 0;
		while(num<101) {
			if(num%2!=0) {
				sum += num;
			}
			num++;
		}
		System.out.println(sum);
		System.out.println();
		
		// while문을 이용하여 -1이 입력될 때까지 정수를 입력받고, 1이 입력되면 입력한 수의 합과 평균을 구하시오.
		System.out.println("while문을 이용하여 -1이 입력될 때까지 정수를 입력받고, 1이 입력되면 입력한 수의 합을 구하시오.");
		Scanner scan = new Scanner(System.in);
		int hap = 0;
		int cnt = 0;
		while(true) {
			System.out.print("정수 하나 입력: ");
			int input = scan.nextInt();
			if(input==-1) {
				break;
			}
			hap += input;
			cnt++;
		}
		System.out.println("입력하신 수의 합은: "+hap);
		System.out.println("입력하신 수의 평균은: "+(double)(hap/cnt));
	}
}
