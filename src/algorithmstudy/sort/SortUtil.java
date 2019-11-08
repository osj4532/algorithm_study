package algorithmstudy.sort;

public class SortUtil {
	
	public static int[] generateRandomNumberArray(int size, int limit) {
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = (int)(Math.random() * limit) + 1;
		}
		return arr;
	}
	
	public static void swap(int[] arr, int idx1, int idx2) {
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
	}
	
	public static void printArr(int[] arr) {
		int len = arr.length;
		for(int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static long getExecutionTime(Sort sort, int[] arr) {
		long st = System.currentTimeMillis();
		sort.sort(arr);
		long et = System.currentTimeMillis();
		return (et - st);
	}
	
	public static void getExecutionTimeAvg(Sort sort, int[] arr, int count) {
		long sum = 0L;
		for(int i = 0; i < count; i++) {
			sum += getExecutionTime(sort, arr);
		}
		System.out.println(sum / count + "ms");
	}

}
