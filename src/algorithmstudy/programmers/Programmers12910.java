package algorithmstudy.programmers;

import java.util.Arrays;

class Solution12910 {
	  public int[] solution(int[] arr, int divisor) {
	      int[] answer 
	          = Arrays.stream(arr).filter(i -> i % divisor == 0).sorted().toArray();
	      if(answer.length == 0){
	          answer = new int[1];
	          answer[0] = -1;
	      }
	          
	      return answer;
	  }
}

public class Programmers12910 {

	public static void main(String[] args) {
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		
		Solution12910 sol = new Solution12910();
		for(int item : sol.solution(arr, divisor)) {
			System.out.print(item+" ");
		}
	}

}
