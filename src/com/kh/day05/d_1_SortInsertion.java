package com.kh.day05;

public class d_1_SortInsertion {
	public static void main(String[] args) {
/* 1. 삽입정렬
 *  - 가장 간단하고 기본이 되는 알고리즘
 *  - 크기가 n인 배열의 index값을 0번에서 n-1번까지 비교
*/
		int arr[] = {2, 5, 4, 1, 3};
		for(int i=1; i<arr.length; i++) {
			for(int j=i; j>0; j--) {
				if(arr[j-1]>arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j]; 
					arr[j] = temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
