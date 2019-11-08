package algorithmstudy.sort;

public class SelectionSort implements Sort{

	@Override
	public int[] sort(int[] arr) {
		int[] newArr = arr.clone();
		int i, j, min, idx = 0;
		int len = newArr.length;
		
		for(i = 0; i < len; i++) {
			min = Integer.MAX_VALUE;
			for(j = i; j < len; j++) {
				if(min > newArr[j]) {
					min = newArr[j];
					idx = j;
				}
			}
			
			SortUtil.swap(newArr, i, idx);
		}
		
		return newArr;
	}

}

// 1 3 2
