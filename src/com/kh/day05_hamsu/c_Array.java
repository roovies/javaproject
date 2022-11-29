package com.kh.day05_hamsu;

import java.util.Scanner;

public class c_Array {
	public void exercise1() {
		// ���̰� 100�� �迭�� �����ϰ�, 1���� 100������ ����
		// ������� �־� �� ���� ����ϴ� �ڵ带 �ۼ��϶�
		int num[] = new int[101];
		for(int i=1; i<num.length; i++) {
			num[i] = i;
			System.out.print(num[i]+" ");
		}
		System.out.println();
	}
	
	
	public void exercise2() {
		// ���̰� 5�� String �迭�� �����ϰ� 
		// "����", "������", "Ű��", "���", "�ٳ���"��
		// �ʱ�ȭ �� ��, for���� Ȱ���ؼ� �ٳ����� ������ �ٳ����� ����غ�����!
//		String fruits[] = new String[5];
//		fruits[0] = "����";
//		fruits[1] = "������";
//		fruits[2] = "Ű��";
//		fruits[3] = "���";
//		fruits[4] = "�ٳ���";
		String fruits[] = {"����","������","Ű��","���","�ٳ���"};
		
		for(int i=0; i<fruits.length; i++) {
			if(fruits[i]=="�ٳ���") {
				System.out.println(fruits[i]);
			}
		}	
	}
	
	public void exercise3() {
		// ���� ���� 5���� �Է¹޾� �迭�� �����ϰ�, �Է¹��� ������ ��� �� ���� ū ���� ���Ͻÿ�.
		Scanner scan = new Scanner(System.in);
		int i=0;
		int sum=0;
		int input[] = new int[5];
		while(i<5) {
			System.out.print("���� "+(i+1)+"��° �Է�: ");
			input[i] = scan.nextInt();
			sum += input[i];
			i++;
		}
		//�Է°� ��� ���ϱ�
		System.out.printf("�Է��� ������ ���: %.2f\n", (double)sum/input.length);
		
		//�Է°� �ִ밪 ���ϱ�
		int temp = 0;
		for(int j=0; j<input.length; j++) {
			if(input[j]>temp) {
				temp = input[j];
			}
		}
		System.out.println(temp);
	}
	public void exercise4() {
		/* [�迭 ���� ����]
		 * ����ڿ��� �ֹι�ȣ�� �Է� ���� ��, ���� �ֹε�Ϲ�ȣ�� ����ŷ�� �ֹε�Ϲ�ȣ �ΰ��� ��µǵ��� �ϼ���
		 * 210618-1****** 
		 * 210618-1124600
		 */
		Scanner scan = new Scanner(System.in);
		char jumin[] = new char[14];
		System.out.print("�ֹι�ȣ�� �Է��ϼ���: ");
		String input_jumin = scan.next();
		for(int i=0; i<input_jumin.length();i++) {
			jumin[i] = input_jumin.charAt(i);
		}
		
		//����ŷ ó�� �ֹι�ȣ ����
		char encrypted_jumin[] = new char[14]; //���� �ش� �κ��� char encrypted_jumin[] = jumin; ���� ���� �迭�� �ʱ�ȭ���ְ� �ȴٸ�
		for(int i=0; i<encrypted_jumin.length; i++) {  //���� ���� �迭�� �ٶ󺸴� �������̱� ������, ���� ���� �����ϹǷ� encrypted_jumin�� ����
			encrypted_jumin[i] = jumin[i];             //�����ϰ� �ȴٸ� jumin�� ���� ����ȴ�.
			if(i>7) {
				encrypted_jumin[i] = '*';
			}
			System.out.print(encrypted_jumin[i]);
		}
		System.out.println();
		for(int i=0; i<jumin.length; i++) {
			System.out.print(jumin[i]);
		}
	}
}

