package com.kh.day05;

public class d_3_BubbleSort {
	public static void main(String[] args) {
/* 3. 버블정렬 (큰 값을 오른쪽으로 계속 쌓아감)
 *  - 인접한 두개의 원소를 검사하여 정렬하는 방법
 *  - 구현이 쉽다는 장점이 있고, 이미 정렬된 데이터를 정렬할 때 가장 빠름
 *  - 기본적으로 다른 정렬에 비해 정렬 속도가 느리며, 역순으로 정렬할 때 가장 느림
 *  - {2, 5, 4, 1, 3}
 *  	i=0일 때 {2, 5, 4, 1, 3}
				 {2, 4, 5, 1, 3}
				 {2, 4, 1, 5, 3}
				 {2, 4, 1, 3, 5}
		i=1일 때 {2, 4, 1, 3, 5}
				 {2, 1, 4, 3, 5}
				 {2, 1, 3, 4, 5}
		i=2일 때 {1, 2, 3, 4, 5}
				 {1, 2, 3, 4, 5}
 */
		int arr[] = {2, 5, 4, 1, 3};
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<(arr.length-1)-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//ㅇ건뭐지
//		int arr[] = {2,5,4,1,3};
//		for(int i=1; i<arr.length; i++) {
//			for(int j=0; j<arr.length-1; j++) {
//				if(arr[j] > arr[j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
	}
}
