package com.kh.day06.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {
	public static void main(String[] args) {
	//����ó�� �ݺ���
//		while(true) {
//			try {
//				Scanner sc = new Scanner(System.in);
//				System.out.print("���� �ϳ� �Է�: ");
//				int num1 = sc.nextInt();
//				System.out.print("���� �ϳ� �� �Է�: ");
//				int num2 = sc.nextInt();
//				int result = num1/num2;
//				System.out.println("�� ���� ���� ���� "+result+"�Դϴ�.");
//				break;
//			}
//			catch(ArithmeticException e) {
//				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
//			}
//		}
		System.out.print("�����Է�1: ");
		Scanner scan = new Scanner(System.in);
		int num11 = scan.nextInt();
		
		while(true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("�����Է�1: ");
				int num1 = sc.nextInt();
				System.out.print("�����Է�2: ");
				int num2 = sc.nextInt();
				System.out.print("�����Է�3: ");
				int num3 = sc.nextInt();
				System.out.println("�� ���� ��: "+(num1+num2+num3));
				System.out.println("1,2��° �Է��� ���� ������: "+num1/num2);
			}
			catch(ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
			}
			catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���.");
			}
		}
	}
}
