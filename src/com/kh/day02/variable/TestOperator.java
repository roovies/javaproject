package com.kh.day02.variable;

public class TestOperator {
	public static void main (String [] args) {
		/* 증감연산자
		   a++ => a를 먼저 사용하고 +1을 해줌
		   ++a => +1을 먼저 하고 a를 사용함
		*/
		
		// a++ 예문
		int a = 1;
		System.out.println(a++);
		System.out.println(a);
		
		// ++a 예문
		int b = 1;
		System.out.println(++b);
		System.out.println(b);

		
	}
}
