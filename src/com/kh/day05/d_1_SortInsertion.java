package com.kh.day05;

public class d_1_SortInsertion {
	public static void main(String[] args) {
/* 1. ��������
 *  - ���� �����ϰ� �⺻�� �Ǵ� �˰���
 *  - ũ�Ⱑ n�� �迭�� index���� 0������ n-1������ ��
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
