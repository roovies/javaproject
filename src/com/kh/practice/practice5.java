package com.kh.practice;

import java.util.Scanner;

public class practice5 {
	public static void main(String[] args) {
		// ������ ��� 1~9��
		for(int i=1;i<10;i++) {
			System.out.println(i+"��");
			for(int j=1;j<10;j++) {
				System.out.print(i+"x"+j+"="+i*j + " ");
			}
			System.out.println();
		}
		
	}
}
