package com.kh.day02.scanner;

import java.util.Scanner;

public class TestScanner {
	public final String IP_ADDR = "127.0.0.1";
	public static final String IP_ADDR = "127.0.0.1";
	public static void main(String[] args) {
		//Scanner ��ü(sc) ����
		Scanner sc = new Scanner(System.in);
		
		//Scanner ��ü(sc) ���
		String name;
		System.out.print("�̸��� �Է��ϼ���: ");
		name = sc.next();
		
		int age;
		System.out.print("���̸� �Է��ϼ���: ");
		age = sc.nextInt(); //�������� �Է¹ޱ� ���� nextInt() �޼ҵ� ���
		
		String dept;
		System.out.print("�μ��� �Է��ϼ���: ");
		dept = sc.nextLine(); //���ڿ��� �Է¹ޱ� ���� next() �޼ҵ� ���
		
		double score;
		System.out.print("������ �Է��ϼ���: ");
		score = sc.nextDouble(); //�Ǽ����� �Է¹ޱ� ���� nextDouble() �޼ҵ� ���
		
		char rank;
		System.out.print("����� �Է��ϼ���: ");
		rank = sc.next().charAt(0); // next()�� ���� ���ڿ��� �Է¹޴µ�, �� �߿� 0��° �ε��� ���� ���� (charAt(0))
		
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("�μ�: " + dept);
		System.out.println("����: " + score);
		System.out.println("���: " + rank);
		
	}
}
