package algorithmstudy.cos.study;

class Solution3_04 {
    public int add(String s1, String s2) {
    	int cnt = 0;
    	int result = 0;
    	
    	for(int i = s1.length() - 1; i >= 0; i--) {
    		String end = s1.substring(i);
    		cnt++;
    		if(s2.startsWith(end)) {
    			result = cnt;
    		}
    	}
    	
    	return result;
    }
	
	public int solution(String s1, String s2) {
        // 여기에 코드를 작성해주세요.
        int len = s1.length() + s2.length();
		int result1 = add(s1, s2);
        int result2 = add(s2, s1);
        
        int answer = Math.max(result1, result2);
        
        return len - answer;
    }
}

public class CosProJava3_04 {
	public static void main(String[] args) {
        Solution3_04 sol = new Solution3_04();
        String s1 = new String("ababc");
        String s2 = new String("abcdab");
        int ret = sol.solution(s1, s2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
