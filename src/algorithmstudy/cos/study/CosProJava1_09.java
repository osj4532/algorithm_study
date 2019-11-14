package algorithmstudy.cos.study;

/*
 	해밍 거리란 같은 길이를 가진 두 개의 문자열에서 같은 위치에 있지만 서로 다른 문자의 개수를 뜻합니다.
 	예를 들어 두 2진수 문자열이 "10010" 과 "110"이라면 먼저 두 문자열의 자릿수를 맞추기 위해
 	"110" 앞에 0 두개를 채워 "00110"으로 만들어 줍니다. 두 문자열은 첫번째와 세번째가 다르므로
 	해밍 거리는 2입니다.
 */

class Solution9{
	public String func_a(String str, int len){
        String padZero = "";
        int padSize = len - str.length();
        for(int i = 0; i < padSize; i++)
            padZero += "0";
        return padZero + str;
    }
    
    public int solution(String binaryA, String binaryB) {
        int maxLength = Math.max(binaryA.length(), binaryB.length());
        binaryA = func_a(binaryA, maxLength);
        binaryB = func_a(binaryB, maxLength);
        
        int hammingDistance = 0;
        for(int i = 0; i < maxLength; i++)
            if(binaryA.charAt(i) != binaryB.charAt(i))
                hammingDistance += 1;
        return hammingDistance;
    }
}

public class CosProJava1_09 {

	public static void main(String[] args) {
		 Solution9 sol = new Solution9();
	     String binaryA = "10010";
	     String binaryB = "110";
	     int ret = sol.solution(binaryA, binaryB);
	        
	     // Press Run button to receive output. 
	     System.out.println("Solution: return value of the method is " + ret + " .");
	}

}
