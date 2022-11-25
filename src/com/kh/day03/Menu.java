package com.kh.day03;

import java.util.Scanner;

public class Menu {
	public static void main(String [] args) {
		// Switch문을 사용하여 메뉴번호를 만드세요.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("0. 종료");
		
		System.out.print("메뉴 번호를 입력하세요: ");
		int num = scan.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("입력메뉴입니다.");
			break;
		case 2:
			System.out.println("수정메뉴입니다.");
			break;
		case 3:
			System.out.println("조회메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제메뉴입니다.");
			break;
		case 0:
			System.out.println("종료했습니다.");
			break;
		default:
			System.out.println("번호를 잘못 누르셨습니다 종료합니다.");
			break;
		}
	}
}
