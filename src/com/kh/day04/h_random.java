package com.kh.day04;

import java.util.Random;
import java.util.Scanner;

public class h_random {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("======���� �յ� ���߱�======");
			System.out.print("�Է�(1: �ո� / 2. �޸� / 3. ����): ");
			int input = scan.nextInt();
			int num = random.nextInt(2)+1; // nextInt(2)�� 0~1�� ���� �ű⿡ +1�� �ϴ� 1~2�� ����
			
			if(input==3) {
				break;
			}
			else if(input==num) {
				System.out.println("�������ϴ�.");
				System.out.println(num);
			}
			else if(input!=num) {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
		}
	}
}
