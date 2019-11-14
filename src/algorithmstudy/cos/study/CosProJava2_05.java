package algorithmstudy.cos.study;

class Solution2_05{
	public int solution(int[] arr) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        int cnt = 1;
        
        for(int i = 1; i < arr.length; i++) {
        	if(arr[i - 1] < arr[i]) {
        		cnt++;
        		answer = Math.max(cnt, answer);
        	}else {
        		cnt = 1;
        	}
        }
        
        
        return answer;
    }
}

public class CosProJava2_05 {

	public static void main(String[] args) {
        Solution2_05 sol = new Solution2_05();
        int[] arr = {3, 1, 2, 4, 5, 1, 2, 2, 3, 4};
        int ret = sol.solution(arr);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }

}
