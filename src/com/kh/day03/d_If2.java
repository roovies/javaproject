package com.kh.day03;

import java.util.Scanner;

public class d_If2 {
	public static void main(String[] args) {
		// 정수 하나를 입력받아서, 양의 정수인지, 0인지, 음의 정수인지 판별하는 프로그램을 작성하시오

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		String result = "";
		if (num > 0) {
			result = "양수";
		} else if (num < 0) {
			result = "음수";
		} else {
			result = "0";
		}

		System.out.println("입력하신 " + num + "값은 " + result + "");
	}}
