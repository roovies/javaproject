package com.kh.practice;

public class practice6 {
	public static void main(String[] args) {
		// 2단옆에 3단, 3단옆에 4단, 4단 옆에 5단이 되도록 작성하시오.
		for(int i=1; i<10; i++) {
			for(int j=2; j<6; j++) {
				System.out.print(j+"x"+i+"= "+i*j+"\t");
			}
			System.out.println();
		}

	}
}
