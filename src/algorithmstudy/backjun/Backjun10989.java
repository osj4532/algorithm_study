package algorithmstudy.backjun;

import java.util.Scanner;

public class Backjun10989 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] counter = new int[10001];
		
		for(int i = 0; i < N; i++) {
			int idx = sc.nextInt();
			counter[idx]++;
		}
		
		for(int i = 1; i < 10001; i++) {
			while(counter[i] != 0) {
				System.out.println(i);
				counter[i]--;
			}
		}
		sc.close();
		
	}

}
