package algorithmstudy.programmers;

class Solution75842 {
	  public String solution(String s) {
	      StringBuilder out = new StringBuilder();
	      String tmp = s.toLowerCase();
	      int idx = 0;
	      while(idx < tmp.length()){
	          char ch = tmp.charAt(idx);
	          if('a' <= ch && ch <= 'z'){
	        	  String in = (ch+"").toUpperCase();
	              out.append(in);
	          }else{
	              out.append(ch+"");
	          }
	          
	          while(idx + 1 < tmp.length() && tmp.charAt(idx) != ' '){
	              out.append(tmp.charAt(++idx));
	          }
	          if(idx < tmp.length())
	        	  idx++;
	      }
	      
	      String answer = out.toString();
	      return answer;
	  }
	}

public class Programmers75842 {

	public static void main(String[] args) {
		Solution75842 sol = new Solution75842();
		System.out.println(sol.solution("3people unFollowed me"));
		System.out.println(sol.solution("for the last week"));

	}

}
