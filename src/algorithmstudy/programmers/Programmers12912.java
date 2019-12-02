package algorithmstudy.programmers;

class Solution12912 {
	public long solution(int a, int b) {
		long answer = 0;

		for(int i = Math.min(a, b); i <= Math.max(a, b); i++)
			answer+= i;
		return answer;
	}
}	

public class Programmers12912 {

	public static void main(String[] args) {
		Solution12912 sol = new Solution12912();
		System.out.println(sol.solution(3, 5));
	}

}
