package com.kh.day06.score;

import java.util.Arrays;
import java.util.Scanner;

public class input_menu {
	public int[] input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("===== ���� �Է� =====");
		int score[] = new int[3];
		System.out.print("����: ");
		score[0] = scan.nextInt();
		System.out.print("����: ");
		score[1] = scan.nextInt();
		System.out.print("����: ");
		score[2] = scan.nextInt();
		return score;
	}
}
