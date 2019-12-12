package algorithmstudy.programmers;

class Solution12900 {
	  public int[] arr;

	  public int getCount(int n){
	      if(n == 1) return 1;
	      if(n == 2) return 2;
	      if(arr[n] != 0) return arr[n];
	      else return arr[n] = (getCount(n-1) + getCount(n-2)) % 1000000007;
	  }
	    
	  public int solution(int n) {
		  arr = new int[n+1];
	      int answer = getCount(n);
	      return answer;
	  }
	}

public class Programmers12900 {

	public static void main(String[] args) {
		Solution12900 sol = new Solution12900();
		for(int i = 1; i <= 60000; i++)
			System.out.println(sol.solution(i));

	}

}
