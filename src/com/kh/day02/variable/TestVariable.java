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
		
		/* Java�� �⺻������ �Ǽ��� double�θ� �����ϹǷ� float�� ���� ������ �ʴ´�.
		float height = 11.1111f;                                // https://strawberry-smoothie.tistory.com/14
		System.out.println(height);    //�� ���� ���ϰ� ������ f�� ���̸� �ȴ�.
		*/
		
		byte bnum = 127; // -128~127
		short snum = 32767; // -32768~32767
		int inum = 2147483647; // -2147483648~2147483647
		
		boolean torf = 5<=5;
		System.out.println(torf);
		
		char fChar = 66; //������(char)�� ���ڸ� ������, ASCII �ڵ带 ���� �ش� ���� ���εǴ� ���ڷ� ��µ�
		System.out.println(fChar);
		
		fChar = 64;
		System.out.println(fChar);
	}
}
