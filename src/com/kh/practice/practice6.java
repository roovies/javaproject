package com.kh.practice;

public class practice6 {
	public static void main(String[] args) {
		// 2�ܿ��� 3��, 3�ܿ��� 4��, 4�� ���� 5���� �ǵ��� �ۼ��Ͻÿ�.
		for(int i=1; i<10; i++) {
			for(int j=2; j<6; j++) {
				System.out.print(j+"x"+i+"= "+i*j+"\t");
			}
			System.out.println();
		}

	}
}
