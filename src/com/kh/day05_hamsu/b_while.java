package com.kh.day05_hamsu;

public class b_while {
	public void holsuhap() {
		// while���� �̿��Ͽ� 1~100 ������ Ȧ���� ���� ����Ͻÿ�
		System.out.println("while���� �̿��Ͽ� 1~100 ������ Ȧ���� ���� ����Ͻÿ�");
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
