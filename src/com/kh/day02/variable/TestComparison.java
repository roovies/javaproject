package com.kh.day02.variable;

public class TestComparison {
	public static void main(String[] args) {
		/* �񱳿�����
		   <, <=, >, >=, ==, !=
		   ��ȯ�� true �Ǵ� false�� ��ȯ�ȴ�.
		   (Python�� ��� True, False�� ù���ڰ� �빮������, Java�� �ҹ��ڷ� ��µȴ�.)
		 */
		
		System.out.println(1>2);
		System.out.println(1<2);
		System.out.println(2<=2);
		System.out.println(1!=1);
		System.out.println(2==1);
		
		/* ��������
		   &&(AND), ||(OR)������ ����. => �ܼ��� ���� ����   <=> ��Ʈ�����ڴ� ��Ʈ���� ��
		 */
		int num1 = 50;
		int num2 = 30;
		boolean result1, result2, result3, result4;
		result1 = (num1 != num2) && (num1 < num2);
		result2 = (num1 < num2) || (num1 == num2);
		result3 = (num1 > num2) && (num1 != num2);
		result4 = (num1 > num2) || (num1 == num2);
		
		int aNum = 70;
		int bNum = 55;
		result1 = (aNum == bNum) || (aNum++ < 100);
		// result1 : true, aNum : 71, bNum : 55
		result2 = (aNum < bNum) && (--bNum < 55);
		// result2 : false, aNum : 71, bNum : 55
		result3 = (aNum != bNum) && (bNum-- < aNum++);
		// result3 : true, aNum : 72, bNum : 54
		result4 = (aNum++ != bNum) || (bNum++ >= 85);
		// result4 : true, aNum : 73, bNum : 54
		System.out.println("result1�� �����: " + result1);
		System.out.println("result2�� �����: " + result2);
		System.out.println("result3�� �����: " + result3);
		System.out.println("reuslt4�� �����: " + result4);
		System.out.println("aNum�� ��: " + aNum + ", bNum�� ��: " + bNum);
		
		/* ¦�� ã��
		   ������ ������(%)�� ���� n%2 == 0 �������� ã�´�.
		   
		   Ȧ�� ã��
		   ���������� % �����ڸ� ���� n%2 != 0 �������� ã�´�.
		 */
		
		int arr[] = {10, 33, 42, 39, 44, 80, 43, 99, 90};
		int cnt = 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]%2==0) {
				cnt+=1;
			}
		}
		int cnt2 = (arr.length) - cnt;
		System.out.println("¦���� ��: " + cnt);
		System.out.println("Ȧ���� ��: " + cnt2);
		
	}
}
