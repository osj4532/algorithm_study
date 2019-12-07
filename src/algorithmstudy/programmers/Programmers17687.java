package algorithmstudy.programmers;

import java.util.*;

class Solution17687 {
  public char[] convert(int n, int num){
      StringBuilder out = new StringBuilder();
      if(num == 0) out.append('0');
      
      while(num > 0){
          int tmp = num % n;
          if(tmp > 9){
              out.append((char)(tmp + 55));
          }else{
              out.append(tmp);
          }
          num /= n;
      }
      return out.reverse().toString().toCharArray();
  }
  public String solution(int n, int t, int m, int p) {
      ArrayList<Character> list = new ArrayList<>();
      for(int i = 0; i < t * m; i++){
          char[] tmp = convert(n, i);
          for(int j = 0; j < tmp.length; j++){
              list.add(tmp[j]);
          }
      }
      StringBuilder answer = new StringBuilder();
      int idx = p - 1;
      for(int i = 0 ; i < t; i++){
          answer.append(list.get(idx));
          idx += m;
      }
      return answer.toString();
  }
}


public class Programmers17687 {
	public static void main(String[] args) {
		Solution17687 sol = new Solution17687();
		System.out.println(sol.solution(2, 4, 2, 1));
		System.out.println(sol.solution(16, 16, 2, 1));
		System.out.println(sol.solution(16, 16, 2, 2));
	}
}
