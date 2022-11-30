package com.kh.day06.score;

public class score_print {
	public void scores(int[] score) {
		System.out.println("===== 성적 출력 =====");
		System.out.println("국어: "+score[0]);
		System.out.println("영어: "+score[1]);
		System.out.println("수학: "+score[2]+"\n");
		System.out.println("총점: "+(score[0]+score[1]+score[2]));
		System.out.printf("평균: %.2f\n", (double)(score[0]+score[1]+score[2])/3);
	}
}
