package com.kh.day02.variable;

public class TestComparison {
	public static void main(String[] args) {
		/* 비교연산자
		   <, <=, >, >=, ==, !=
		   반환은 true 또는 false로 반환된다.
		   (Python의 경우 True, False로 첫글자가 대문자지만, Java는 소문자로 출력된다.)
		 */
		
		System.out.println(1>2);
		System.out.println(1<2);
		System.out.println(2<=2);
		System.out.println(1!=1);
		System.out.println(2==1);
		
		/* 논리연산자
		   &&(AND), ||(OR)연산자 존재. => 단순히 값을 비교함   <=> 비트연산자는 비트값을 비교
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
		System.out.println("result1의 결과값: " + result1);
		System.out.println("result2의 결과값: " + result2);
		System.out.println("result3의 결과값: " + result3);
		System.out.println("reuslt4의 결과값: " + result4);
		System.out.println("aNum의 값: " + aNum + ", bNum의 값: " + bNum);
		
		/* 짝수 찾기
		   나머지 연산자(%)를 통해 n%2 == 0 형식으로 찾는다.
		   
		   홀수 찾기
		   마찬가지로 % 연산자를 통해 n%2 != 0 형식으로 찾는다.
		 */
		
		int arr[] = {10, 33, 42, 39, 44, 80, 43, 99, 90};
		int cnt = 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]%2==0) {
				cnt+=1;
			}
		}
		int cnt2 = (arr.length) - cnt;
		System.out.println("짝수의 수: " + cnt);
		System.out.println("홀수의 수: " + cnt2);
		
	}
}
