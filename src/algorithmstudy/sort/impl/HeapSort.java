package algorithmstudy.sort.impl;

import algorithmstudy.sort.Sort;
import algorithmstudy.sort.util.SortUtil;

public class HeapSort implements Sort{

	@Override
	public int[] sort(int[] arr) {
		int[] newArr = arr.clone();
		
		for(int i = 0; i < newArr.length; i++) {
			int c = i;
			do {
				int root = (c - 1) / 2;
				if(newArr[root] < newArr[c]) {
					SortUtil.swap(newArr, c, root);
				}
				
				c = root;
			}while(c != 0);
		}
		
		for(int i = newArr.length - 1; i >= 0; i--) {
			SortUtil.swap(newArr, 0, i);
			
			int root = 0;
			int c = 1;
			do {
				c = root * 2 + 1;
				if(c + 1 < i && newArr[c] < newArr[c + 1]) {
					c++;
				}
				
				if(c < i && newArr[c] > newArr[root]) {
					SortUtil.swap(newArr, c, root);
				}
				
				root = c;
			}while(c < i);
		}
		
		return newArr;
	}

}
