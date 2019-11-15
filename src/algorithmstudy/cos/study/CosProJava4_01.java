package algorithmstudy.cos.study;

import java.util.ArrayList;

class Solution4_01 {
    String[] vowels = {"A", "E", "I", "O", "U"};
    ArrayList<String> words;
    public void create_words(int lev, String str) {
        words.add(str);
        for (int i = 0; i < 5; i++) {
            if (lev < 5) {
                create_words(lev+1, str.concat(vowels[i]));
            }
        }
    }
    
    public int solution(String word) {
        int answer = 0;
        words  = new ArrayList<String>();
        create_words(0, "");
        for (int i = 0; i < words.size(); i++) {
            if (word.equals(words.get(i))) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}

public class CosProJava4_01 {
	public static void main(String[] args) {
        Solution4_01 sol = new Solution4_01();
        String word1 = new String("AAAAE");
        int ret1 = sol.solution(word1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        String word2 = new String("AAAE");
        int ret2 = sol.solution(word2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
