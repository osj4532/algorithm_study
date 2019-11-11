package algorithmstudy.sort.impl;

import algorithmstudy.sort.Sort;
import algorithmstudy.sort.util.SortUtil;

public class QuickSort implements Sort {

	public void quickSort(int[] arr, int start, int end) {
		//원소가 1개인 경우
		if(start >= end) return;
		
		int key = start;
		int i = start + 1;
		int j = end;
		
		while(i <= j) {
			while(i < end && arr[key] >= arr[i]) {
				i++;
			}
			
			while(j > start && arr[key] <= arr[j]) {
				j--;
			}
			
			if(i >= j) {
				SortUtil.swap(arr, key, j);
			}else {
				SortUtil.swap(arr, i, j);
			}
		}
		
		quickSort(arr, start, j - 1);
		quickSort(arr, j + 1, end);
	}
	
	@Override
	public int[] sort(int[] arr) {
		int[] newArr = arr.clone();
		int end = newArr.length - 1;
		quickSort(newArr, 0, end);
		return newArr;
	}

}
