package com.kh.day03;

import java.util.Scanner;

public class d_If2 {
	public static void main(String[] args) {
		// ���� �ϳ��� �Է¹޾Ƽ�, ���� ��������, 0����, ���� �������� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�

		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		int num = scan.nextInt();
		String result = "";
		if (num > 0) {
			result = "���";
		} else if (num < 0) {
			result = "����";
		} else {
			result = "0";
		}

		System.out.println("�Է��Ͻ� " + num + "���� " + result + "");
	}}
