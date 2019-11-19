package algorithmstudy.sort.impl;

import algorithmstudy.sort.Sort;

public class CountingSort implements Sort{

	@Override
	public int[] sort(int[] arr) {
		int[] countArr = new int[arr.length];
		int[] newArr = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++) {
			newArr[arr[i]]++;
		}
		
		int k = 0;
		for(int i = 0; i < newArr.length; i++) {
			if(newArr[i] != 0) {
				for(int j = 0; j < newArr[i]; j++) {
					countArr[k] = i;
					k++;
				}
			}
		}
		return countArr;
	}
	
}
