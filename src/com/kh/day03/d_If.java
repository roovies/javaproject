package com.kh.day03;

import java.util.Scanner;

public class d_If {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		//IF���� �̿��Ͽ� ������ �Է¹޾� ¦������ Ȧ������ �Ǻ��ϴ� ���α׷��� �ۼ��϶�.
		System.out.print("���ڸ� �Է��ϼ���: ");
		int num = scan.nextInt();
		
		if(num%2==0) {
			System.out.println("�Է��Ͻ� "+num+"���� ¦���Դϴ�.");
		}
		else {
			System.out.println("�Է��Ͻ� "+num+"���� Ȧ���Դϴ�.");
		}
	}
}
