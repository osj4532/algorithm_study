package algorithmstudy.cos.study;

/*
 	A와 B는 계단 게임을 했다.
 	규칙
 	1. 계단 제일 아래에서 게임 시작(0번째 칸)
 	2. 가위바위보를 합니다.
 	3. 이기면 계단 세칸을 올라가고, 지면 한칸을 내려가고, 비기면 제자리에 있는다.
 	4. 계단 제일 아래에서 지면 제자리에 있는다.
 	5. 2~4 과정을 열번 반복합니다.
 	
 	A와 B가 게임을 완료 후 A가 계단 위 몇 번째 칸에 있는지 파악하려고 합니다.
 	
 */
class Solution6{
	 public int func(int record){
	        if(record == 0) return 1;
	        else if(record == 1) return 2;
	        return 0;
	    }

	    public int solution(int[] recordA, int[] recordB){
	        int cnt = 0;
	        for(int i = 0; i < recordA.length; i++){
	            if(recordA[i] == recordB[i])
	                continue;
	            else if(recordA[i] == func(recordB[i]))
	                cnt = cnt + 3;
	            else
	            	cnt = Math.max(cnt - 1, 0);
	        }
	        return cnt;
	    }
}

public class CosProJava1_06 {

	public static void main(String[] args) {
		 Solution6 sol = new Solution6();
	        int[] recordA = {2,0,0,0,0,0,1,1,0,0};
	        int[] recordB = {0,0,0,0,2,2,0,2,2,2};
	        int ret = sol.solution(recordA, recordB);

	        // Press Run button to receive output. 
	        System.out.println("Solution: return value of the method is " + ret + " .");
	}

}
