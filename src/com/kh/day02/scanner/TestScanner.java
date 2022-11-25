package com.kh.day02.scanner;

import java.util.Scanner;

public class TestScanner {
	public final String IP_ADDR = "127.0.0.1";
	public static final String IP_ADDR = "127.0.0.1";
	public static void main(String[] args) {
		//Scanner 객체(sc) 생성
		Scanner sc = new Scanner(System.in);
		
		//Scanner 객체(sc) 사용
		String name;
		System.out.print("이름을 입력하세요: ");
		name = sc.next();
		
		int age;
		System.out.print("나이를 입력하세요: ");
		age = sc.nextInt(); //정수형을 입력받기 위해 nextInt() 메소드 사용
		
		String dept;
		System.out.print("부서를 입력하세요: ");
		dept = sc.nextLine(); //문자열을 입력받기 위해 next() 메소드 사용
		
		double score;
		System.out.print("학점을 입력하세요: ");
		score = sc.nextDouble(); //실수형을 입력받기 위해 nextDouble() 메소드 사용
		
		char rank;
		System.out.print("등급을 입력하세요: ");
		rank = sc.next().charAt(0); // next()를 통해 문자열을 입력받는데, 그 중에 0번째 인덱스 값만 추출 (charAt(0))
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("부서: " + dept);
		System.out.println("학점: " + score);
		System.out.println("등급: " + rank);
		
	}
}
