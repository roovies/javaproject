package com.kh.day05;

import com.kh.day05_hamsu.c_Array;

public class c_Array_run {
	public static void main(String [] args) {
		// int�� �迭
		int a[] = new int[10];  // �Ǵ� int[] a = new int[10];
		//int a[];
		//a = new int[10];
		
		for(int i=0; i<a.length; i++) {
			a[i] = i;
			System.out.println(a[i]);
		}
		
		
		// char�� �迭
		char[] word = new char[] {'H','e','l','l','o',' ','W','o','r','l','d'};
		for(int j=0; j<word.length; j++) {
			System.out.print(word[j]); //H, e, l, l, o ... �� ���ھ� ��µ�
		}
		System.out.println();
		System.out.println(word); // word�迭 ��ü�� ��µ� (������ �����ϸ� ��. word�� &word[0]�� �ּҸ� ��� ����)
		
		//�ܺ��Լ� ȣ��
		c_Array c_array = new c_Array();
		c_array.exercise1();
		c_array.exercise2();
		//c_array.exercise3();
		c_array.exercise4();

	}
}
