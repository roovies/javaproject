package com.kh.day02.exercise;

public class Quiz {
	public static void main(String[] args) {
		// 1. 50�� 1~100 ������ �������� Ȯ���϶�.
		int num = 50;
		boolean result1 = num>1 && num<100;
		System.out.println("1���� 100������ �����ΰ�? :" + result1);
		
		// 2. ���� A�� �빮������ �ҹ������� Ȯ���϶�.
		char word = 'A';
		boolean result2 = word>=65 || word<97;
		System.out.println("���� �빮�� Ȯ�� : " + result2);
		
	}
}
