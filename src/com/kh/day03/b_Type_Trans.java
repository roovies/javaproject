package com.kh.day03;

public class b_Type_Trans {
	public static void main(String[] args) {
		//�ڷ��� ��ȯ (�ڵ�/����)
		int iNum = 10;
		double dNum = 13.2;
		double result = iNum + dNum;
		System.out.println(result);
		
		System.out.println("���� ����ȯ: "+ (int)result);
		
		//����
		byte b = 127;
		int i = 100;
		System.out.println(b+i); // b�� int�� �ڵ� ����ȯ
		System.out.println(10/4);
		System.out.println(10.0/4); // 4�� 4.0 �Ǽ��� �ڵ� ����ȯ
		System.out.println((char)0x12340041); // ���� ����ȯ => 0x41�� �Ǹ�, ���� A�� �ڵ�
		System.out.println((byte)(b+i)); // ���� ����ȯ => 227
		System.out.println((int)2.9 + 1.8); // ���� ����ȯ => 2.9�� int������ ��ȯ�Ͽ� 2�� �Ǹ�, 2+1.8=3.8�� ��
		System.out.println((int)(2.9+1.8)); // ���� ����ȯ => 2.9+1.8�� ���� �� �Ŀ� ���� ����ȯ�� �Ͽ� 4�� ��
		System.out.println((int)2.9 + (int)1.8); // ���� ����ȯ => 2.9�� 1.8�� ���� ���� ����ȯ�� �Ͽ� 2+1=3�� ��
		
		//�ڵ� ����ȯ�� ������ �ս��� ������, ���� ����ȯ�� ũ�Ⱑ ū �ڷ����� ũ�Ⱑ ���� �ڷ������� ���������� ��ȯ�ϱ� ������ ������ �ս��� �߻�
	}
}
