package algorithmstudy.book;

public class Fibonacci {
	//O(2^n)
	public static int fibo(int x) {
		if(x == 1) return 1;
		if(x == 2) return 1;
		return fibo(x-1) + fibo(x-2);
	}
	
	static int[] dp = new int[100];
	//O(n)
	public static int fiboByDp(int x) {
		if(x == 1) return 1;
		if(x == 2) return 1;
		if(dp[x] != 0) return dp[x];
		return dp[x] = fiboByDp(x-1) + fiboByDp(x-2);
	}
	
	public static void main(String[] args) {
		System.out.println(fibo(10));
		System.out.println(fiboByDp(46));
	}

}
