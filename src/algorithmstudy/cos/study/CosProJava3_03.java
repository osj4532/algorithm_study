package algorithmstudy.cos.study;

class Solution3_03{
	
	 public int solution(String[] bishops) {
		 				//하좌, 상좌, 하우, 하좌 
		 	int[] bx = {1, 1, -1, -1};
		 	int[] by = {1, -1, 1, -1};
		 
		 	int idx = 0;
		 	
		 	for(String bishop : bishops) {
		 		int curX = bishop.charAt(0) - 16 - '0';
		 		int curY = bishop.charAt(1) - '0';
		 		
		 		int[][] posArr = new int[64][2];
		 		
		 		posArr[idx][0] = curX;
		 		posArr[idx][1] = curY;
		 		idx++;
		 		
		 		for(int i = 0; i < bx.length; i++) {
		 			int newY = curY;
		 			int newX = curX;
		 			
		 			while(true) {
		 				if(newX > 0 && newX < 9 && newY > 0 && newY < 9) {
		 					boolean isContains = false;
		 					for(int j = 0; j < idx; j++) {
		 						if(posArr[j][0] == newX && posArr[j][1] == newY) {
		 							isContains = true;
		 							break;
		 						}
		 					}
		 					
		 					if(!isContains) {
		 						posArr[idx][0] = newX;
		 						posArr[idx][1] = newY;
		 						idx++;
		 					}
		 				}else {
		 					break;
		 				}
		 				newX = newX + bx[i];
			 			newY = newY + by[i];
		 			}
		 		}
		 	}
		 	
	        int answer = 64 - idx;
	        return answer;
	    }
}

public class CosProJava3_03 {
	public static void main(String[] args) {
        Solution3_03 sol = new Solution3_03();
        String[] bishops1 = {new String("D5")};
        int ret1 = sol.solution(bishops1);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        String[] bishops2 = {new String("D5"), new String("E8"), new String("G2")};
        int ret2 = sol.solution(bishops2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
