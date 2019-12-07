package algorithmstudy.book;

//pivotal(대각선이 고정인 행렬) 3x3, 4x4를 뒤집는 로직을 짜보세요 재귀를 써야함.
// (Math.pow(arr.length, 2) - arr.length)/2;
public class ReversePivotal { 
		
	public void reverse(int[][] arr, int i, int j) {
		if(i == arr.length - 1) return;
		
		int tmp = arr[i][j];
		arr[i][j] = arr[j][i];
		arr[j][i] = tmp;
		
		if(j == arr.length - 1) {
			i++;
			j = i + 1;
		}else {
			j++;
		}
		reverse(arr, i, j);
	}
	
	public int[][] genArr(int size){
		int[][] arr = new int[size][size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				arr[i][j] = (i * size) + j;
			}
		}
		return arr;
	}
	
	public void printArr(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i][j] > 9)
					System.out.print(arr[i][j] + " ");
				else
					System.out.print("0"+arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		ReversePivotal rp = new ReversePivotal();
		int[][] arr = rp.genArr(4);
		rp.printArr(arr);
		
		System.out.println();
		
		rp.reverse(arr, 0, 0);
		rp.printArr(arr);
	}

}
