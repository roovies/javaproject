package com.kh.day05;

public class d_3_BubbleSort {
	public static void main(String[] args) {
/* 3. �������� (ū ���� ���������� ��� �׾ư�)
 *  - ������ �ΰ��� ���Ҹ� �˻��Ͽ� �����ϴ� ���
 *  - ������ ���ٴ� ������ �ְ�, �̹� ���ĵ� �����͸� ������ �� ���� ����
 *  - �⺻������ �ٸ� ���Ŀ� ���� ���� �ӵ��� ������, �������� ������ �� ���� ����
 *  - {2, 5, 4, 1, 3}
 *  	i=0�� �� {2, 5, 4, 1, 3}
				 {2, 4, 5, 1, 3}
				 {2, 4, 1, 5, 3}
				 {2, 4, 1, 3, 5}
		i=1�� �� {2, 4, 1, 3, 5}
				 {2, 1, 4, 3, 5}
				 {2, 1, 3, 4, 5}
		i=2�� �� {1, 2, 3, 4, 5}
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
		
		//���ǹ���
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
