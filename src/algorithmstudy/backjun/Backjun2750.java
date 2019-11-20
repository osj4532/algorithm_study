package algorithmstudy.backjun;

import java.util.Scanner;

public class Backjun2750 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[1001];
		int number, i, j, min, idx = 0, temp;
		number = sc.nextInt();
		
		for(i = 0; i < number; i++) {
			array[i] = sc.nextInt();
		}
		
		for(i = 0; i < number; i++) {
			min = 1001;
			for(j = i; j < number; j++) {
				if(array[j] < min) {
					min = array[j];
					idx = j;
				}
			}
			
			temp = array[i];
			array[i] = array[idx];
			array[idx] = temp;
		}

		for(i = 0; i < number; i++) {
			System.out.print(array[i] + " ");
		}
		
		sc.close();
	}

}
