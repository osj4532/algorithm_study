package algorithmstudy.cos.study;

class Solution5_06 {	
    public int toDecimal(String str, int p) {
    	int mul = 0;
    	int result = 0;
    	for(int i = str.length() - 1; i >= 0; i--) {
    		result += (str.charAt(i) - '0') * Math.pow(p, mul);
    		mul++;
    	}
    	return result;
    }
    
    public String fromDecimal(int num, int q) {
    	String str = "";
    	while(num > 0) {
    		int tmp = num % q;
    		str += tmp;
    		num /= q;
    	}
    	
    	String result = "";
    	for(int i = str.length() - 1; i >= 0; i--) {
    		result += str.charAt(i);
    	}
    	
    	return result;
    }
	
	public String solution(String s1, String s2, int p, int q) {
        // 여기에 코드를 작성해주세요.
    	int num1 = toDecimal(s1, p), num2 = toDecimal(s2, p);
    	int sum = num1 + num2;
    	
        String answer = fromDecimal(sum, q);
        return answer;
    }
}

public class CosProJava5_06 {
	public static void main(String[] args) {
    	Solution5_06 sol = new Solution5_06();
    	String s1 = new String("112001");
        String s2 = new String("12010");
        int p = 3;
        int q = 8;
    	String ret = sol.solution(s1, s2, p, q);
    	
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
   }
}
