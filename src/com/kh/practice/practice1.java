package com.kh.practice;

import java.util.Scanner;

public class practice1 {
	public static void main(String[] args) {
		//����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϼ���.
		// ��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("1�̻��� ���� �ϳ��� �Է��ϼ���: ");
			int input = scan.nextInt();
			int temp = input;
			if(input<1) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
				continue;
			}
			System.out.println("�Է��Ͻ� ����: "+input);
			for(int i=0; i<input; i++) {
				System.out.print(temp+" ");
				temp--;
			}
			break;
		}
	}
}
