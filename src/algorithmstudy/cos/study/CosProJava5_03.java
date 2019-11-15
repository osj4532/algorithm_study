package algorithmstudy.cos.study;

import java.util.Arrays;

class Solution5_03 {
	public void swap(int[] numbers, int i, int j) {
		int tmp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = tmp;
	}

    public int[] solution(int[] numbers) {
        int[] answer = {};

        Arrays.sort(numbers);
        int mid = (numbers.length - 1) / 2;
        swap(numbers, mid, numbers.length-1);

        int left = mid + 1;
        int right = numbers.length - 2;
        while(left <= right) {
        	swap(numbers, left, right);
        	left = left + 1;
        	right = right - 1;
        }

        answer = numbers;
        return answer;
    }
}

public class CosProJava5_03 {
	public static void main(String[] args) {
    	Solution5_03 sol = new Solution5_03();
    	int[] numbers = {7, 3, 4, 1, 2, 5, 6};
    	int[] ret = sol.solution(numbers);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.print("solution 메소드의 반환 값은 {");
    	for(int i = 0; i < ret.length; i++) {
    		if(i != 0)
    			System.out.print(", ");
    		System.out.print(ret[i]);
    	}
    	System.out.println("} 입니다.");
    }
}
