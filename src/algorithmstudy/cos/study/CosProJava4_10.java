package algorithmstudy.cos.study;

class Solution4_10 {
    public int solution(int a, int b) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        long i, j;
        
        for(i = 2; i < b; i++) {
        	for(j = 2; j < i; j++) {
        		if(i % j == 0) {
        			break;
        		}
        	}
        	
        	if(i == j) {
        		double dou = Math.pow(i, 2);
        		double tri = Math.pow(i, 3);
        		if(a <= dou && dou <= b) {
        			answer++;
        		}
        		
        		if(a <= tri && tri <= b) {
        			answer++;
        		}
        	}
        	
        }
        
        return answer;
    }
}

public class CosProJava4_10 {
	public static void main(String[] args){
        Solution4_10 sol = new Solution4_10();
        int a = 6;
        int b = 30;
        int ret = sol.solution(a, b);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
