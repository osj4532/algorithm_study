package algorithmstudy.cos.study;


/*
 	n x n 크기의 격자에 1부터 n x n까지의 수가 하나씩 있습니다.
 	1 2 3
 	8 9 4
 	7 6 5
 	이렇게 배치 되어 있다면 n-소용돌이 수라고 부릅니다.
 	격자의 크기 n이 주어질 때 n-소용돌이 수의 대각선상에 존재하는 수들의 합을 return
 	하는 solution을 완성해주세요.
 	
 */ 

class Solution2{
	public int solution2(int n) {
		int answer = 1;
		int new_value = 1;
		
		if((n-1) % 2 == 0 && n > 1) {
			int num_generated = n - 1;
			while(num_generated != 0) {
				if(num_generated % 2 == 0) {
					int plus_operand = num_generated*2;
					new_value += plus_operand;
					answer+= new_value;
					System.out.println(answer);
				}else {
					int plus_operand = (num_generated+1)*2;
					new_value += plus_operand;
					answer += new_value;
					System.out.println(answer);
				}
				num_generated--;
			}
		}else {
			int num_generated = n-1;
	        while(num_generated!=0){
	            if(num_generated%2!=0){
	                int plus_operand = num_generated *2;
	                new_value += plus_operand;
	                answer+= new_value;

	            }
	            else{
	                int plus_operand = (num_generated+1)*2;
	                new_value+= plus_operand;
	                answer+= new_value;
	            }
	            num_generated--;
	        }
		}
		return answer;
	}
	
	 public int solution(int n) {
		 if(n == 1) return 1;
		 int answer = 0;
		 
		 int[][] arr = new int[n][n];
		 int cnt = n;
		 int col = -1, row = 0;
		 int val = 1;
		 int direction = 1;
		 
		 
		 while(true) {
			 if(cnt == 0) break;
			 
			 for(int i = 0; i < cnt; i++) {
				 col += direction;
				 arr[row][col] = val++;
			 }
			 
			 cnt--;
			 
			 for(int i = 0; i < cnt; i++) {
				 row += direction;
				 arr[row][col] = val++;
			 }
			 
			 direction *= -1;
		 }
		 
		 for(int i = 0; i < n; i++) {
			 answer += arr[i][i];
		 }
		 
		 return answer;
		 
	 }
}

public class CosProJava1_02 {

	 public static void main(String[] args) {
	        Solution2 sol = new Solution2();
	        int n1 = 3;
	        int ret1 = sol.solution(n1);

	        
	        // Press Run button to receive output. 
	        System.out.println("Solution: return value of the method is " + ret1 + " .");
	        
	        int n2 = 2;
	        int ret2 = sol.solution(n2);
	        
	        // Press Run button to receive output. 
	        System.out.println("Solution: return value of the method is " + ret2 + " .");
	        
	        int n3 = 4;
	        int ret3 = sol.solution(n3);
	        
	        // Press Run button to receive output. 
	        System.out.println("Solution: return value of the method is " + ret3 + " .");
	    }

}
