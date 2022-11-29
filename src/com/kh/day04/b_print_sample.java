package com.kh.day04;

public class b_print_sample {
	public static void main(String[] args) {
		// System.out.println에서 정수+문자열은 문자열로 처리됨
		System.out.println(1+"1+1");
		// System.out.println에서 문자+문자는 문자로 처리됨
		System.out.println('1'+'1'); // '11' -> ASCII코드로 98이 출력됨
		// 정수+정수+문자열+정수 = 문자열
		System.out.println(10+20+"Hello"+10);
		
		// pinrtf 함수
		// %d, %s, %c, %o, %x 등 출력타입을 지정하여 해당 변수에 값을 넣어 출력되도록 해주는 것.
		System.out.printf("정수 출력 : %d\n", 1); // %d = 정수형 출력
		System.out.printf("실수 출력 : %f\n", 3.14); // %f = 실수형 출력
		System.out.printf("8진수 출력 : %o\n", 10); // %o = 8진수 출력  => 12
		System.out.printf("16진수 출력 : %x\n", 10); // %x = 16진수 출력 => a
		System.out.printf("문자열 출력 : %s\n", "Hello World"); // %s = 문자열 출력
		System.out.printf("문자열 출력 : %c\n", 'A'); // %c = 문자 출력
		// 문자는 무조건 작은따옴표(')로 묶어야 함.
	}
}
