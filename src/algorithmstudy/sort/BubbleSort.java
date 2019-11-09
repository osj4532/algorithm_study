package algorithmstudy.sort;

public class BubbleSort implements Sort{

	@Override
	public int[] sort(int[] arr) {
		int[] newArr = arr.clone();
		int len = newArr.length;
		
		for(int i = 0; i < len; i++) {
			for(int j = 1; j < len-i; j++) {
				if(newArr[j - 1] > newArr[j]) {
					SortUtil.swap(newArr, j - 1, j);
				}
			}
		}
		return newArr;
	}
	
}
