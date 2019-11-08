package algorithmstudy.test;

import algorithmstudy.sort.InsertionSort;
import algorithmstudy.sort.SelectionSort;
import algorithmstudy.sort.SortUtil;

public class SortTest {

	public static void main(String[] args) {
		int[] arr = SortUtil.generateRandomNumberArray(100_000, 100_000);
		//int[] arr = SortUtil.generateRandomNumberArray(10, 10);
		
		InsertionSort insertionSort = new InsertionSort();
		SelectionSort selectionSort = new SelectionSort();
		
		SortUtil.getExecutionTimeAvg(insertionSort, arr, 100);
		SortUtil.getExecutionTimeAvg(selectionSort, arr, 100);
	}

}
