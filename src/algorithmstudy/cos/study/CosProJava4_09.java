package algorithmstudy.cos.study;

class Solution4_09 {
    public String solution(int hour, int minute) {
        // 여기에 코드를 작성해주세요.
        int hourToMin = (hour * 5) % 60;
        double result = (hourToMin - minute) * 6;
        result %= 360;
        result = Math.abs(result);
        
        String answer = Double.toString(result);
        return answer;
    }
}

public class CosProJava4_09 {
	public static void main(String[] args) {
        Solution4_09 sol = new Solution4_09();
        int hour = 12;
        int minute = 45 ;
        String ret = sol.solution(hour, minute);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}	
