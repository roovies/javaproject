package com.kh.day04;

import java.util.Scanner;

public class e_loop_while {
	public static void main(String[] args) {
		// while���� �̿��Ͽ� 1~100 ������ Ȧ���� ���� ����Ͻÿ�
		System.out.println("while���� �̿��Ͽ� 1~100 ������ Ȧ���� ���� ����Ͻÿ�");
		int num = 1;
		int sum = 0;
		while(num<101) {
			if(num%2!=0) {
				sum += num;
			}
			num++;
		}
		System.out.println(sum);
		System.out.println();
		
		// while���� �̿��Ͽ� -1�� �Էµ� ������ ������ �Է¹ް�, 1�� �ԷµǸ� �Է��� ���� �հ� ����� ���Ͻÿ�.
		System.out.println("while���� �̿��Ͽ� -1�� �Էµ� ������ ������ �Է¹ް�, 1�� �ԷµǸ� �Է��� ���� ���� ���Ͻÿ�.");
		Scanner scan = new Scanner(System.in);
		int hap = 0;
		int cnt = 0;
		while(true) {
			System.out.print("���� �ϳ� �Է�: ");
			int input = scan.nextInt();
			if(input==-1) {
				break;
			}
			hap += input;
			cnt++;
		}
		System.out.println("�Է��Ͻ� ���� ����: "+hap);
		System.out.println("�Է��Ͻ� ���� �����: "+(double)(hap/cnt));
	}
}
