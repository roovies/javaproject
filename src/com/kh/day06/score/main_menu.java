package com.kh.day06.score;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.day06.score.input_menu;
import com.kh.day06.score.score_print;

public class main_menu {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		input_menu input_menu = new input_menu();
		score_print score_print = new score_print();
		int score[] = new int[4];
		while(true) {
			try {
				System.out.println("===== ���� �޴� =====");
				System.out.println("1. �����Է�");
				System.out.println("2. �������");
				System.out.println("3. ����");
				System.out.print("���� : ");
				int choice = scan.nextInt();
				if(choice == 1) {
					score = input_menu.input();
				}
				else if(choice == 2) {
					score_print.scores(score);
				}
				else if(choice ==3) {
					System.out.println("Good Bye~");
					break;
				}
				else {
					System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �õ����ּ���");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("���ڴ� �Է��� �Ұ����մϴ�. ���ڸ� �Է��ϼ���.");
				scan.next();
			}
		}
	}
}
