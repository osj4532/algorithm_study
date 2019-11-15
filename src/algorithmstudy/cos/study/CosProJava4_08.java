package algorithmstudy.cos.study;

import java.util.ArrayList;

class Solution4_08 {
	
	ArrayList<Integer> numList = new ArrayList<Integer>();
	
	public int[] cardCount(int[] card) {
		int[] cardCount = new int[10];
		for(int i = 0; i < card.length; i++) {
			cardCount[card[i]]++;
		}
		return cardCount;
	}
	
	public void combi(int level, int maxLevel, int[] curCount, int[] maxCount, int num) {
		if(level == maxLevel) {
			numList.add(num);
			return;
		}
		
		for(int i = 1; i <= 9; i++) {
			if(curCount[i] < maxCount[i]) {
				curCount[i]++;
				combi(level+1, maxLevel, curCount, maxCount, num * 10 + i);
				curCount[i]--;
			}
		}
		
	}
	
	public int findPos(ArrayList<Integer> list, int n) {
		for(int i = 0; i < list.size(); i++) {
			if(numList.get(i) == n) {
				return i+1;
			}
		}
		return -1;
	}
	
    public int solution(int[] card, int n) {
        // 여기에 코드를 작성해주세요.
    	int[] cardCount = cardCount(card);
    	combi(0, card.length, new int[10], cardCount, 0);
    	int answer = findPos(numList, n);
    	return answer;
    }
}

public class CosProJava4_08 {
	public static void main(String[] args) {
        Solution4_08 sol = new Solution4_08();
        int card1[] = {1, 2, 1, 3};
        int n1 = 1312;
        int ret1 = sol.solution(card1, n1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int card2[] = {1, 1, 1, 2};
        int n2 = 1122;
        int ret2 = sol.solution(card2, n2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
