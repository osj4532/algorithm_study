package algorithmstudy.cos.study;

/*
	0을 포함하지 않은 자연수 num이 매개변수로 주어질 때, 이 수에 1을 더한 수를
	return 하도록 solution을 완성해주세요.
*/

class Solution1{
	public long solution(long num) {
		long answer = num + 1;
		try {
			String numStr = Long.toString(answer);
			numStr = numStr.replace("0", "1");
			
			answer = Long.parseLong(numStr);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
        return answer;
    }
}

public class CosProJava1_01 {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        long num = 9949999;
        long ret = sol.solution(num);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
    }

}
