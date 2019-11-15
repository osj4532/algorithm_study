package algorithmstudy.cos.study;

class Solution5_05 {
    public int solution(int[] enemies, int[] armies) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        int i = 0, j = 0;
        while(i < armies.length && j < enemies.length) {
        	if(armies[i] >= enemies[j]) {
    			answer++;
    		}else {
    			i--;
    		}
        	i++;
    		j++;
        }
        
        return answer;
    }
}

public class CosProJava5_05 {
	public static void main(String[] args) {
    	Solution5_05 sol = new Solution5_05();
    	int[] enemies1 = {1, 4, 3};
    	int[] armies1 = {1, 3};
    	int ret1 = sol.solution(enemies1, armies1);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

    	int[] enemies2 = {1, 1, 1};
    	int[] armies2 = {1, 2, 3, 4};
    	int ret2 = sol.solution(enemies2, armies2);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
