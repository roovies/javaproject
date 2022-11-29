package com.kh.day05_hamsu;

public class b_while {
	public void holsuhap() {
		// while문을 이용하여 1~100 사이의 홀수의 합을 출력하시오
		System.out.println("while문을 이용하여 1~100 사이의 홀수의 합을 출력하시오");
		int num = 1;
		int sum = 0;
		while(num<101) {
			if(num%2!=0) {
				sum += num;
			}
			num++;
		}
		System.out.println(sum);
		System.out.println();
	}
}
