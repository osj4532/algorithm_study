package algorithmstudy.cos.study;

import java.util.Arrays;

/*
 	1번부터 N번까지 후보에 대해서 투표를 진행했습니다.
 	예를 들어 투표 결과가 [1,5,4,3,2,5,2,5,5,4]라면
 	[1번,5번,4번,3번,2번,5번,2번,5번,5번,4번] 후보에 투표했음을 나타냅니다.
 	이때 가장 많은 표를 받은 후보의 번호를 구하려고 한다.
 */

class Solution5{
	public int[] solution(int N, int[] votes) {
        int voteCounter[] = new int[11];
        for (int i = 0; i < votes.length; i++) {
            voteCounter[votes[i]] += 1;
        }
        int maxVal = 0;
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (maxVal < voteCounter[i]) {
                maxVal = voteCounter[i];
                cnt = 1;
            }
            else if(maxVal == voteCounter[i]){
                cnt += 1;
            }
        }
        int answer[] = new int[cnt];
        for (int i = 1, idx = 0; i <= N; i++){
            if (voteCounter[i] == maxVal) {
                answer[idx] = i;
                idx += 1;
            }
        }
        return answer;
    }
}

public class CosProJava1_05 {

	public static void main(String[] args) {
		Solution5 sol = new Solution5();
        int N1 = 5;
        int[] votes1 = {1,5,4,3,2,5,2,5,5,4};
        int[] ret1 = sol.solution(N1, votes1);
 
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + Arrays.toString(ret1) + " .");
        

        int N2 = 4;
        int[] votes2 = {1, 3, 2, 3, 2};
        int[] ret2 = sol.solution(N2, votes2);
 
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + Arrays.toString(ret2) + " .");
	}

}
