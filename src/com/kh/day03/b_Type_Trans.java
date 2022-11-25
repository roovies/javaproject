package com.kh.day03;

public class b_Type_Trans {
	public static void main(String[] args) {
		//자료형 변환 (자동/강제)
		int iNum = 10;
		double dNum = 13.2;
		double result = iNum + dNum;
		System.out.println(result);
		
		System.out.println("강제 형변환: "+ (int)result);
		
		//예문
		byte b = 127;
		int i = 100;
		System.out.println(b+i); // b는 int로 자동 형변환
		System.out.println(10/4);
		System.out.println(10.0/4); // 4는 4.0 실수로 자동 형변환
		System.out.println((char)0x12340041); // 강제 형변환 => 0x41이 되며, 문자 A의 코드
		System.out.println((byte)(b+i)); // 강제 형변환 => 227
		System.out.println((int)2.9 + 1.8); // 강제 형변환 => 2.9를 int형으로 변환하여 2가 되며, 2+1.8=3.8이 됨
		System.out.println((int)(2.9+1.8)); // 강제 형변환 => 2.9+1.8을 먼저 한 후에 강제 형변환을 하여 4가 됨
		System.out.println((int)2.9 + (int)1.8); // 강제 형변환 => 2.9와 1.8을 각각 강제 형변환을 하여 2+1=3이 됨
		
		//자동 형변환은 데이터 손실이 없지만, 강제 형변환은 크기가 큰 자료형을 크기가 작은 자료형으로 강제적으로 변환하기 때문에 데이터 손실이 발생
	}
}
