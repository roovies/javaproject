package com.kh.practice;

import java.util.Scanner;

public class practice4 {
	public static void main(String[] args) {
		// Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�, ����� �ƴϸ� ������� �ƴϴ١��� ����ϼ���.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �ϳ��� �Է��ϼ���: ");
		int input = scan.nextInt();
		if(input>0) {
			System.out.println("�����");
		}
		else if (input==0) {
			System.out.println("0�̴�");
		}
		else {
			System.out.println("����� �ƴϴ�");
		}
	}
}
