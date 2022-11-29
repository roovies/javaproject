package com.kh.day04;

import java.util.Random;
import java.util.Scanner;

public class h_random {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("======동전 앞뒤 맞추기======");
			System.out.print("입력(1: 앞면 / 2. 뒷면 / 3. 종료): ");
			int input = scan.nextInt();
			int num = random.nextInt(2)+1; // nextInt(2)는 0~1의 숫자 거기에 +1을 하니 1~2의 숫자
			
			if(input==3) {
				break;
			}
			else if(input==num) {
				System.out.println("맞혔습니다.");
				System.out.println(num);
			}
			else if(input!=num) {
				System.out.println("틀렸습니다.");
			}
		}
	}
}
