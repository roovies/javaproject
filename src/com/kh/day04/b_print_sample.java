package com.kh.day04;

public class b_print_sample {
	public static void main(String[] args) {
		// System.out.println���� ����+���ڿ��� ���ڿ��� ó����
		System.out.println(1+"1+1");
		// System.out.println���� ����+���ڴ� ���ڷ� ó����
		System.out.println('1'+'1'); // '11' -> ASCII�ڵ�� 98�� ��µ�
		// ����+����+���ڿ�+���� = ���ڿ�
		System.out.println(10+20+"Hello"+10);
		
		// pinrtf �Լ�
		// %d, %s, %c, %o, %x �� ���Ÿ���� �����Ͽ� �ش� ������ ���� �־� ��µǵ��� ���ִ� ��.
		System.out.printf("���� ��� : %d\n", 1); // %d = ������ ���
		System.out.printf("�Ǽ� ��� : %f\n", 3.14); // %f = �Ǽ��� ���
		System.out.printf("8���� ��� : %o\n", 10); // %o = 8���� ���  => 12
		System.out.printf("16���� ��� : %x\n", 10); // %x = 16���� ��� => a
		System.out.printf("���ڿ� ��� : %s\n", "Hello World"); // %s = ���ڿ� ���
		System.out.printf("���ڿ� ��� : %c\n", 'A'); // %c = ���� ���
		// ���ڴ� ������ ��������ǥ(')�� ����� ��.
	}
}
