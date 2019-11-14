package algorithmstudy.cos.study;

class Solution2_04{
	public int solution(int[] arr, int K) {
        int answer = 0;
        int len = arr.length;
        
        for(int i = 0; i < len; i++) {
        	for(int j = 0; j < len; j++) {
        		if(i == j) break;
        		
        		for(int k = 0; k < len; k++) {
        			if(j == k) break;
        			int sum = arr[i] + arr[j] + arr[k];
        			if(sum % K == 0) {
        				answer++;
        			}
        		}
        	}
        }
        return answer;
    }
}

public class CosProJava2_04 {

	 public static void main(String[] args) {
	        Solution2_04 sol = new Solution2_04();
	        int[] arr = {1, 2, 3, 4, 5};
	        int K = 3;
	        int ret = sol.solution(arr, K);


	        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	    }

}
