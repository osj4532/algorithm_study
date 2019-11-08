package algorithmstudy.test;

import algorithmstudy.sort.InsertionSort;
import algorithmstudy.sort.SortUtil;

public class SortTest {

	public static void main(String[] args) {
		int[] arr = SortUtil.generateRandomNumberArray(100_000, 100_000);
		
		InsertionSort insertionSort = new InsertionSort();
		SortUtil.getExecutionTime(insertionSort, arr);
	}

}
