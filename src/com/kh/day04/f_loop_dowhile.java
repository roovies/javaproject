package com.kh.day04;

import java.util.Scanner;

public class f_loop_dowhile {
	public static void main(String[] args) {
		// do while���� ����Ͽ� -1�� �Էµ� ������ ������ �Է¹ް�, 1�� �ԷµǸ� �Է��� ���� �հ� ����� ���Ͻÿ�.
		
		Scanner scan = new Scanner(System.in);
		
		int input = 0;
		int sum = 0;
		do {
			System.out.print("���� �Է�: ");
			input = scan.nextInt();
			if(input==-1) {
				break;
			}
			sum += input;
		} while(true);
		
		System.out.println("�Է��Ͻ� ���� ��: "+sum);
	}
}
