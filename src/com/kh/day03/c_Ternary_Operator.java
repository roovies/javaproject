package com.kh.day03;

import java.util.Scanner;

public class c_Ternary_Operator { //���׿�����
	public static void main(String [] args) {
		//���׿����ڸ� �̿��Ͽ� ������ �Է¹޾� ¦������ Ȧ������ �Ǻ��ϴ� ���α׷��� �ۼ��϶�.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int num;
		num = scan.nextInt();
		String result;
		result = (num%2==0) ? "¦��":"Ȧ��";
		System.out.println("�Է��� "+num+"���� "+result+"�Դϴ�.");
	}
}

