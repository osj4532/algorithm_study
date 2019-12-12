package algorithmstudy.programmers;

import java.util.*;

class Solution42626 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i = 0; i < scoville.length; i++)
            q.offer(scoville[i]);
        
        while(K >= q.peek()){
            if(q.size() == 1)
                return -1;
            int tmp = q.poll() + (q.poll() * 2);
            q.offer(tmp);
            answer++;
        }
        return answer;
    }
}

public class Programmers42626 {

	public static void main(String[] args) {
		Solution42626 sol = new Solution42626();
		int[] scoville = {1,2,3,9,10,12};
		int K = 7;
		System.out.println(sol.solution(scoville, K));

	}

}
