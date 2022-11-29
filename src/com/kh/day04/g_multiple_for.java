package com.kh.day04;

public class g_multiple_for {
	public static void main(String[] args) {
		// 2단옆에 3단, 3단옆에 4단, 4단 옆에 5단이 되도록 작성하시오.
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
