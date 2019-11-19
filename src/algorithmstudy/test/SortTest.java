package algorithmstudy.test;

import algorithmstudy.sort.impl.BubbleSort;
import algorithmstudy.sort.impl.HeapSort;
import algorithmstudy.sort.impl.InsertionSort;
import algorithmstudy.sort.impl.MergeSort;
import algorithmstudy.sort.impl.QuickSort;
import algorithmstudy.sort.impl.SelectionSort;
import algorithmstudy.sort.util.SortUtil;

public class SortTest {

	//실행시 기간이 오래걸릴수 있기 때문에 주의 해주시기 바랍니다.
	public static void main(String[] args) {
		int[] arr = SortUtil.generateRandomNumberArray(100_000, 100_000);
		//int[] arr = SortUtil.generateRandomNumberArray(10, 10);
		
		InsertionSort insertionSort = new InsertionSort();
		SelectionSort selectionSort = new SelectionSort();
		BubbleSort bubbleSort = new BubbleSort();
		QuickSort quickSort = new QuickSort();
		MergeSort mergeSort = new MergeSort();
		HeapSort heapSort = new HeapSort();
		
		SortUtil.getExecutionTimeAvg(insertionSort, arr, 100);
		SortUtil.getExecutionTimeAvg(selectionSort, arr, 100);
		SortUtil.getExecutionTimeAvg(bubbleSort, arr, 100);
		SortUtil.getExecutionTimeAvg(quickSort, arr, 100);
		SortUtil.getExecutionTimeAvg(mergeSort, arr, 100);	//10ms
		SortUtil.getExecutionTimeAvg(heapSort, arr, 100);	//13ms
	}

}
