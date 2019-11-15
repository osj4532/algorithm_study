package algorithmstudy.cos.study;

class Solution3_05{
	public String solution(String phrases, int second) {
        // 여기에 코드를 작성해주세요.
        /*
		String answer = "";
        int len = phrases.length();
        second = second % (len * 2);
        if(second < len) {
        	for(int i = 0; i < len-second; i++) {
        		answer+="_";
        	}
        	
        	answer += phrases.substring(0, second);
        }else if(second > len){
        	second -= len;
        	answer += phrases.substring(second);
        	int tmp = answer.length();
        	for(int i = 0; i < len - tmp; i++) {
        		answer += "_";
        	}
        }else if(second == 0){
        	for(int i = 0; i < len; i++) {
        		answer+="_";
        	}
        }else {
        	answer = phrases;
        }
        */
		
		
		String answer = "";
		String display = "______________" + phrases;
		for(int i = 0; i < second; i++) {
			display = display + Character.toString(display.charAt(0));
			display = display.substring(1);
		}
		answer = display.substring(0,14);
		
        return answer;
    }
}

public class CosProJava3_05 {
	 public static void main(String[] args) {
	        Solution3_05 sol = new Solution3_05();
	        String phrases = new String("happy-birthday");
	        int second = 3;
	        String ret = sol.solution(phrases, second);
	        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	    }
}
