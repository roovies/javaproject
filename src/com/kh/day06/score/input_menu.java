package com.kh.day06.score;

import java.util.Arrays;
import java.util.Scanner;

public class input_menu {
	public int[] input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("===== 성적 입력 =====");
		int score[] = new int[3];
		System.out.print("국어: ");
		score[0] = scan.nextInt();
		System.out.print("영어: ");
		score[1] = scan.nextInt();
		System.out.print("수학: ");
		score[2] = scan.nextInt();
		return score;
	}
}
