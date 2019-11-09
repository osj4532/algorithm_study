package algorithmstudy.test;

import algorithmstudy.sort.BubbleSort;
import algorithmstudy.sort.InsertionSort;
import algorithmstudy.sort.SelectionSort;
import algorithmstudy.sort.SortUtil;

public class SortTest {

	//실행시 기간이 오래걸릴수 있기 때문에 주의 해주시기 바랍니다.
	public static void main(String[] args) {
		int[] arr = SortUtil.generateRandomNumberArray(100_000, 100_000);
		//int[] arr = SortUtil.generateRandomNumberArray(10, 10);
		
		InsertionSort insertionSort = new InsertionSort();
		SelectionSort selectionSort = new SelectionSort();
		BubbleSort bubbleSort = new BubbleSort();

		SortUtil.getExecutionTimeAvg(insertionSort, arr, 100);
		SortUtil.getExecutionTimeAvg(selectionSort, arr, 100);
		SortUtil.getExecutionTimeAvg(bubbleSort, arr, 100);
	}

}
