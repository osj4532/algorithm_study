package algorithmstudy.cos.study;

import java.util.Arrays;

class Solution2_06{
	 public int[] solution(String commands) {
	        // 여기에 코드를 작성해주세요.
		 	int curX = 0, curY = 0;
		 	for(int i = 0; i < commands.length(); i++) {
		 		char tmp = commands.charAt(i);
		 		if(tmp == 'U') {
		 			curY += 1;
		 		}else if(tmp == 'D') {
		 			curY -= 1;
		 		}else if(tmp == 'L') {
		 			curX -= 1;
		 		}else if(tmp == 'R') {
		 			curX += 1;
		 		}
		 	}
		 
	        int[] answer = {curX, curY};
	        return answer;
	    }
}

public class CosProJava2_06 {

	 public static void main(String[] args) {
	        Solution2_06 sol = new Solution2_06();
	        String commands = "URDDL";
	        int[] ret = sol.solution(commands);

	        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
	    }

}
