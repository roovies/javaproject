package com.kh.day05;

import com.kh.day05_hamsu.c_Array;

public class c_Array_run {
	public static void main(String [] args) {
		// int형 배열
		int a[] = new int[10];  // 또는 int[] a = new int[10];
		//int a[];
		//a = new int[10];
		
		for(int i=0; i<a.length; i++) {
			a[i] = i;
			System.out.println(a[i]);
		}
		
		
		// char형 배열
		char[] word = new char[] {'H','e','l','l','o',' ','W','o','r','l','d'};
		for(int j=0; j<word.length; j++) {
			System.out.print(word[j]); //H, e, l, l, o ... 한 문자씩 출력됨
		}
		System.out.println();
		System.out.println(word); // word배열 전체가 출력됨 (포인터 생각하면 됨. word는 &word[0]의 주소를 담고 있음)
		
		//외부함수 호출
		c_Array c_array = new c_Array();
		c_array.exercise1();
		c_array.exercise2();
		//c_array.exercise3();
		c_array.exercise4();

	}
}
