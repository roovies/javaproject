package com.kh.day04;

public class g_multiple_for {
	public static void main(String[] args) {
		// 2�ܿ��� 3��, 3�ܿ��� 4��, 4�� ���� 5���� �ǵ��� �ۼ��Ͻÿ�.
		/*
		for(int i=2; i<3; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i+"x"+j+"= "+i*j+"     "+(i+1)+"x"+j+"= "+(i+1)*j+"     "+(i+2)+"x"+j+"= "+(i+2)*j+"     "+(i+3)+"x"+j+"= "+(i+3)*j);
			}
		}
		*/
		
		for(int i=2; i<6; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i+"x"+j+"= "+i*j);
			}
		}
	}
}
