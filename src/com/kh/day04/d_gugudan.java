package com.kh.day04;

import java.util.Scanner;

public class d_gugudan {
	public static void main(String[] args) {
		// ������ �ϳ� �Է¹޾Ƽ� �� ���� 1~9 ������ ���� ����, �� ���� �������� ����϶�.
		// �� ������ ���� ������ 1~9 ������ ����� �Է��ؾ� �մϴ�.�� ����ϼ���
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��ϼ���: ");
		int input = scan.nextInt();
		
		if((input<1) || (input>9)) {
			System.out.println("1~9 ������ ����� �Է��ؾ� �մϴ�.");
		}
		else {
			for(int i=1; i<10; i++) {
				System.out.println(input+"x"+i+"= "+input*i);
			}
		}
	}
	
}
