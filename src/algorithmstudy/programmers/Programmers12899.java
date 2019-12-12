package algorithmstudy.programmers;

class Solution12899 {
	  public String solution(int n) {
	      String[] item = {"1", "2", "4"};
	      int len = item.length;
	      StringBuilder out = new StringBuilder();
	      
	      while(n > 0){
	    	  int tmp = n % len - 1;
	    	  if(tmp < 0) tmp = len - 1;
	    	  if(n % len == 0) n -= 1;
	          out.append(item[tmp]);
	          n /= len;
	      }
	      
	      String answer = out.reverse().toString();
	      return answer;
	  }
	}

public class Programmers12899 {

	public static void main(String[] args) {
		Solution12899 sol = new Solution12899();
		for(int i = 1; i <= 20; i++)
			System.out.println("n : "+ i + ", " + sol.solution(i));

	}

}
