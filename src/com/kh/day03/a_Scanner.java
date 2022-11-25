package com.kh.day03;

import java.util.Scanner;

public class a_Scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//변수
		String name;
		int month;
		double height;
		String sex;
		String addr;
		
		//입력값 받기
		System.out.print("이름을 입력해주세요: ");
		name = scan.next();
		System.out.println("입력하신 이름은 "+name+"입니다.");

		scan.nextLine();
		System.out.print("주소를 입력해주세요: ");
		addr = scan.nextLine();
		System.out.println("입력하신 주소는 "+addr+"입니다.");
		
	}
}
		/*
		System.out.print("태어난 월을 입력해주세요: ");
		month = scan.nextInt();
		System.out.println("입력하신 월은 "+month+"입니다.");
		
		System.out.print("키를 입력해주세요: ");
		height = scan.nextDouble();
		System.out.println("입력하신 키는 "+height+"입니다.");
		
		System.out.print("성별을 입력해주세요: ");
		sex = scan.next();
		System.out.println("입력하신 성별은 "+sex+"입니다.");
		*/
		//scan.nextLine();
