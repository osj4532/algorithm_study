package algorithmstudy.sort.impl;

import algorithmstudy.sort.Sort;

public class MergeSort implements Sort{

	public int[] sorted;
	
	public void merge(int[] arr, int start, int middle, int end) {
		int i = start;
		int j = middle + 1;
		int k = start;
		
		while(i <= middle && j <= end) {
			if(arr[i] <= arr[j]) {
				sorted[k] = arr[i];
				i++;
			}else {
				sorted[k] = arr[j];
				j++;
			}
			k++;
		}
		
		if(i > middle) {
			for(int t = j; t <= end; t++) {
				sorted[k] = arr[t];
				k++;
			}
		}else {
			for(int t = i; t <= middle; t++) {
				sorted[k] = arr[t];
				k++;
			}
		}
		
		for(int t = start; t <= end; t++) {
			arr[t] = sorted[t];
		}
	}
	
	public void mergeSort(int[] arr, int start, int end) {
		if(start < end) {
			int middle = (start + end) / 2;
			mergeSort(arr, start, middle);
			mergeSort(arr, middle + 1, end);
			merge(arr, start, middle, end);
		}
	}
	
	@Override
	public int[] sort(int[] arr) {
		sorted = new int[arr.length];
		int[] newArr = arr.clone();
		mergeSort(newArr, 0, newArr.length - 1);
		return newArr;
	}

}
