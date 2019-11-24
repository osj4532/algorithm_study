package algorithmstudy.programmers;

import java.util.Arrays;

public class Programmers60057 {

	public int getLength(String s, int len){
        int idx = 0;
        int count = 1;
        StringBuilder sb = new StringBuilder();
        
        while((idx + len * 2) - 1 < s.length()){
            if(s.substring(idx, idx+len).equals(s.substring(idx+len, idx+len*2))){
                count++;
            }else{
                if(count > 1){
                    sb.append(count);
                    count = 1;
                }
                sb.append(s.substring(idx, idx+len));
            }
            idx += len;
        }
        
        if(count > 1){
            sb.append(count);
        }
        sb.append(s.substring(idx));
        return sb.length();
    }
    
    public int getMin(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    
    public int solution(String s) {
        if(s.length() == 1) return 1;
        int[] arr = new int[s.length()/2];
        for(int i = 0; i < s.length()/2; i++){
            arr[i] = getLength(s, i + 1);
        }
        return getMin(arr);
    }
	
	public static void main(String[] args) {
		Programmers60057 zip = new Programmers60057();
		String[] strs = {"aabbaccc", "ababcdcdababcdcd","abcabcdede","abcabcabcabcdededededede",
				"xababcdcdababcdcd"};
		for(int i = 0; i < strs.length; i++) {
			System.out.println(zip.solution(strs[i]));
		}
	}

}
