package algorithmstudy.cos.study;

class Solution5_02 {
    public int solution(int[][] walls) {
        int answer = 0;

        for(int i = 0; i < walls.length; i++) {
        	for(int j = i+1; j < walls.length; j++) {
        		int area = 0;
        		if(walls[j][1] > walls[i][1])
        			area = walls[i][1] * (walls[j][0] - walls[i][0]);
        		else
        			area = walls[j][1] * (walls[j][0] - walls[i][0]);

        		if(answer < area)
        			answer = area;
        	}
        }

        return answer;
    }
}

public class CosProJava5_02 {
	public static void main(String[] args) {
    	Solution5_02 sol = new Solution5_02();
    	int[][] walls = {{1, 4}, {2, 6}, {3, 5}, {5, 3}, {6, 2}};
    	int ret = sol.solution(walls);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
