package algorithmstudy.programmers;

import java.util.ArrayList;
import java.util.Arrays;

class Solution42586{
	
	public int[] solution1(int[] progresses, int[] speeds) {
		int[] days = new int[100];
		int day = -1;
		for(int i = 0; i < progresses.length; i++) {
			while(progresses[i] + (day * speeds[i]) < 100) {
				day++;
			}
			days[day]++;
		}
		
		return Arrays.stream(days).filter(i -> i != 0).toArray();
	}
	
	public int[] solution2(int[] progresses, int[] speeds) {
        int[] days = new int[progresses.length];
        int cnt = 0;
        
        for(int i = 0; i < progresses.length; i++){
            cnt = 0;
            int progress = progresses[i];
            while(progress < 100){
                progress += speeds[i];
                cnt++;
            }
            days[i] = cnt;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        int idx = 0, max = 0;
        cnt = 1;
        while(idx < days.length - 1){
            max = Math.max(days[idx], max);
            if(max >= days[idx+1]){
                cnt++;
            }else{
                list.add(cnt);
                cnt = 1;
            }
            idx++;   
        }
        
        list.add(cnt);
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        return answer;
	}
}

public class Programmers42586 {

	public static void main(String[] args) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		
		Solution42586 sol = new Solution42586();
		for(int item : sol.solution1(progresses, speeds)) {
			System.out.print(item + " ");
		}
		System.out.println();
		
		for(int item : sol.solution2(progresses, speeds)) {
			System.out.print(item + " ");
		}
	}

}
