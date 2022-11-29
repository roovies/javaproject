package com.kh.practice;

public class practice7 {
	public static void main(String[] args) {
		// 0시 0분 부터 23시 59분까지 출력
		
		for(int i=0; i<24; i++) {
			for(int j=0; j<60; j++) {
				System.out.println(i+"시 "+j+"분");
			}
		}
	}
}
