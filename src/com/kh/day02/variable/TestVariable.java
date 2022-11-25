package com.kh.day02.variable;

public class TestVariable {
	public static void main (String [] args) {
		int num = 34;
		System.out.println(num);
		
		String sentence = "Hello World";
		System.out.println(sentence);
		
		char word = 'a';
		System.out.println(word);
		
		num+=5;
		System.out.println(num);
		
		double weight = 55.123456789;
		System.out.println(weight);
		
		/* Java는 기본적으로 실수를 double로만 간주하므로 float는 거의 사용되지 않는다.
		float height = 11.1111f;                                // https://strawberry-smoothie.tistory.com/14
		System.out.println(height);    //즉 만약 상하고 싶으면 f를 붙이면 된다.
		*/
		
		byte bnum = 127; // -128~127
		short snum = 32767; // -32768~32767
		int inum = 2147483647; // -2147483648~2147483647
		
		boolean torf = 5<=5;
		System.out.println(torf);
		
		char fChar = 66; //문자형(char)에 숫자를 넣으면, ASCII 코드를 통해 해당 값에 매핑되는 문자로 출력됨
		System.out.println(fChar);
		
		fChar = 64;
		System.out.println(fChar);
	}
}
