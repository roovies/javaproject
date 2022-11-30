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
				System.out.println("===== 메인 메뉴 =====");
				System.out.println("1. 성적입력");
				System.out.println("2. 성적출력");
				System.out.println("3. 종료");
				System.out.print("선택 : ");
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
					System.out.println("잘못 입력했습니다. 다시 시도해주세요");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("문자는 입력이 불가능합니다. 숫자만 입력하세요.");
				scan.next();
			}
		}
	}
}
