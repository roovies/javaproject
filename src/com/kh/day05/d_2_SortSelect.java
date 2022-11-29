package com.kh.day05;

public class d_2_SortSelect {
	public static void main(String[] args) {
/* 2. 선택정렬
 *  - 배열을 전부 검색하여 최소값을 고르고, 왼쪽부터 차례대로 채워나가는 정렬방식
 *  - 특징: 데이터양이 적을 땐 성능이 좋지만, 데이터양이 많으면 급격한 성능저하를 보인다.
 *  - 배열의 n번 인덱스값을 n+1번~마지막 인덱스까지 비교함
 *    (ex 0번 인덱스값을 1번인덱스~마지막 인덱스까지 비교)
 */
		int arr[] = {2, 5, 4, 1, 3};
		int min_idx; //인덱스값 저장 변수
		for(int i=0; i<arr.length; i++) {
			min_idx = i; //가장 작을 때 인덱스값
			for(int j=i+1; j<arr.length; j++) {
				if(arr[min_idx] > arr[j]) {
					min_idx = j;
				}
			}
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
		// i=0일 때 -> {1, 5, 4, 2, 3}
		// i=1일 때 -> {1, 2, 4, 5, 3}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
