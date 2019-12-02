package algorithmstudy.programmers;

import java.util.ArrayList;

class Solution12906 {
	public int[] solution(int []arr) {
        int idx = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(idx < arr.length){
            int tmp = arr[idx];
            list.add(tmp);
            while(idx < arr.length && tmp == arr[idx]){
                idx++;
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        return answer;
	}
}

public class Programmers12906 {

	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		
		Solution12906 sol = new Solution12906();
		for(int item : sol.solution(arr)) {
			System.out.print(item + " ");
		}
	}

}
