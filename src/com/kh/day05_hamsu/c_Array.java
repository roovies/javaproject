package com.kh.day05_hamsu;

import java.util.Scanner;

public class c_Array {
	public void exercise1() {
		// 길이가 100인 배열을 선언하고, 1부터 100까지의 값을
		// 순서대로 넣어 그 값을 출력하는 코드를 작성하라
		int num[] = new int[101];
		for(int i=1; i<num.length; i++) {
			num[i] = i;
			System.out.print(num[i]+" ");
		}
		System.out.println();
	}
	
	
	public void exercise2() {
		// 길이가 5인 String 배열을 선언하고 
		// "딸기", "복숭아", "키위", "사과", "바나나"로
		// 초기화 한 후, for문을 활용해서 바나나가 있으면 바나나를 출력해보세요!
//		String fruits[] = new String[5];
//		fruits[0] = "딸기";
//		fruits[1] = "복숭아";
//		fruits[2] = "키위";
//		fruits[3] = "사과";
//		fruits[4] = "바나나";
		String fruits[] = {"딸기","복숭아","키위","사과","바나나"};
		
		for(int i=0; i<fruits.length; i++) {
			if(fruits[i]=="바나나") {
				System.out.println(fruits[i]);
			}
		}	
	}
	
	public void exercise3() {
		// 양의 정수 5개를 입력받아 배열에 저장하고, 입력받은 값들의 평균 및 가장 큰 수를 구하시오.
		Scanner scan = new Scanner(System.in);
		int i=0;
		int sum=0;
		int input[] = new int[5];
		while(i<5) {
			System.out.print("정수 "+(i+1)+"번째 입력: ");
			input[i] = scan.nextInt();
			sum += input[i];
			i++;
		}
		//입력값 평균 구하기
		System.out.printf("입력한 값들의 평균: %.2f\n", (double)sum/input.length);
		
		//입력값 최대값 구하기
		int temp = 0;
		for(int j=0; j<input.length; j++) {
			if(input[j]>temp) {
				temp = input[j];
			}
		}
		System.out.println(temp);
	}
	public void exercise4() {
		/* [배열 참조 예문]
		 * 사용자에게 주민번호를 입력 받은 후, 원본 주민등록번호와 마스킹된 주민등록번호 두개가 출력되도록 하세요
		 * 210618-1****** 
		 * 210618-1124600
		 */
		Scanner scan = new Scanner(System.in);
		char jumin[] = new char[14];
		System.out.print("주민번호를 입력하세요: ");
		String input_jumin = scan.next();
		for(int i=0; i<input_jumin.length();i++) {
			jumin[i] = input_jumin.charAt(i);
		}
		
		//마스킹 처리 주민번호 생성
		char encrypted_jumin[] = new char[14]; //만약 해당 부분을 char encrypted_jumin[] = jumin; 으로 원래 배열로 초기화해주게 된다면
		for(int i=0; i<encrypted_jumin.length; i++) {  //둘은 같은 배열을 바라보는 포인터이기 때문에, 같은 값을 참조하므로 encrypted_jumin의 값을
			encrypted_jumin[i] = jumin[i];             //변경하게 된다면 jumin의 값도 변경된다.
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

