package algorithmstudy.programmers;

import java.util.Collections;
import java.util.PriorityQueue;


class Solution2570 {
    public int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0, idx=0;
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
        while(stock < k) {
        	while(idx < dates.length && dates[idx] <= stock) {
        		q.add(supplies[idx]);
        		idx++;
        	}
        	answer++;
        	stock += q.poll();
        }
        
        return answer;
    }
}

public class Programmers2570 {

	public static void main(String[] args) {
		Solution2570 sol = new Solution2570();
		int[] dates = {4,10,15};
		int[] supplies = {20,5,10};
		System.out.println(sol.solution(4, dates, supplies, 30));

	}

}
