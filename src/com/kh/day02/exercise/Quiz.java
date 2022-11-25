package com.kh.day02.exercise;

public class Quiz {
	public static void main(String[] args) {
		// 1. 50이 1~100 사이의 숫자인지 확인하라.
		int num = 50;
		boolean result1 = num>1 && num<100;
		System.out.println("1부터 100사이의 숫자인가? :" + result1);
		
		// 2. 문자 A가 대문자인지 소문자인지 확인하라.
		char word = 'A';
		boolean result2 = word>=65 || word<97;
		System.out.println("영어 대문자 확인 : " + result2);
		
	}
}
