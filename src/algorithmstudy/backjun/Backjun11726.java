package algorithmstudy.backjun;

import java.util.Scanner;

public class Backjun11726 {
	// n = 1  1
	// n = 2  2
	// n = 3  3
	// n = 4  5
	static int[] dpArr = new int[1000];
	
	public static int dp(int x) {
		if(x == 1) return 1;
		if(x == 2) return 2;
		if(dpArr[x] != 0) return dpArr[x];
		return dpArr[x] = (dp(x - 1) + dp(x - 2)) % 100007;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(dp(x));
		sc.close();
	}

}
