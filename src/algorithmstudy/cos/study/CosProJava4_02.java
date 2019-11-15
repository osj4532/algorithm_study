package algorithmstudy.cos.study;

class Solution4_02 {    
    public String solution(String s) {
        s = s.toLowerCase();
        String answer = "";
        char previous = s.charAt(0);
        int counter = 1;
        
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == previous)
                counter++;
            else {
                answer += previous;
                answer += counter;
                counter = 1;
                previous = s.charAt(i);
            }
        }
        answer += previous;
        answer += counter;
        return answer;
    }
}

public class CosProJava4_02 {
	public static void main(String[] args) {
        Solution4_02 sol = new Solution4_02();
        String s = new String("YYYYYbbbBbbBBBMmmM");
        String ret = sol.solution(s);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
   }
}
