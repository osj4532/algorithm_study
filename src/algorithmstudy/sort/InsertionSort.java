package algorithmstudy.sort;

public class InsertionSort implements Sort{
	//삽입 정렬
	public int[] sort(int[] arr) {
		int[] newArr = arr.clone();
		int i, j;
		int len = newArr.length;
		
		for(i = 0; i < len; i++) {
			j = i;
			while(j >= 0
					&& j + 1 < len
					&& newArr[j] > newArr[j + 1]) {
				SortUtil.swap(newArr, j, j + 1);
				j--;
			}
		}
		
		return newArr;
	}
}
