package algorithmstudy.cos.study;
/*
 	체스에서 나이트의 위치가 주어질때 이동할수 있는 칸의 개수를 구하시오.
 */
class Solution3{
	public int solution(String pos) {
		int[] kx = {3, 3,-3,-3, 1,-1, 1,-1};
		int[] ky = {1,-1, 1,-1, 3, 3,-3,-3};
		int answer = 0;
		
		int x = 0, y = 0;
		String[] kxy = pos.split("");
		x = kxy[0].charAt(0) - 16 - '0';
		y = Integer.parseInt(kxy[1]);
		
		for(int i = 0; i < kx.length; i++) {
			int newX = x + kx[i];
			int newY = y + ky[i];
			
			if(newX > 0 && newX < 9 
					&& newY > 0 && newY < 9) {
				answer++;
			}
		}
				
        return answer;
    }
}

public class CosProJava1_03 {

	public static void main(String[] args) {
		Solution3 sol = new Solution3();
        String pos = "A7";
        int ret = sol.solution(pos);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
        
        String pos2 = "C5";
        int ret2 = sol.solution(pos2);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret2 + " .");
	}

}
