package com.kh.day05;

public class d_2_SortSelect {
	public static void main(String[] args) {
/* 2. ��������
 *  - �迭�� ���� �˻��Ͽ� �ּҰ��� ����, ���ʺ��� ���ʴ�� ä�������� ���Ĺ��
 *  - Ư¡: �����;��� ���� �� ������ ������, �����;��� ������ �ް��� �������ϸ� ���δ�.
 *  - �迭�� n�� �ε������� n+1��~������ �ε������� ����
 *    (ex 0�� �ε������� 1���ε���~������ �ε������� ��)
 */
		int arr[] = {2, 5, 4, 1, 3};
		int min_idx; //�ε����� ���� ����
		for(int i=0; i<arr.length; i++) {
			min_idx = i; //���� ���� �� �ε�����
			for(int j=i+1; j<arr.length; j++) {
				if(arr[min_idx] > arr[j]) {
					min_idx = j;
				}
			}
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
		// i=0�� �� -> {1, 5, 4, 2, 3}
		// i=1�� �� -> {1, 2, 4, 5, 3}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
