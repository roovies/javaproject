package com.kh.day06.score;

public class score_print {
	public void scores(int[] score) {
		System.out.println("===== ���� ��� =====");
		System.out.println("����: "+score[0]);
		System.out.println("����: "+score[1]);
		System.out.println("����: "+score[2]+"\n");
		System.out.println("����: "+(score[0]+score[1]+score[2]));
		System.out.printf("���: %.2f\n", (double)(score[0]+score[1]+score[2])/3);
	}
}
