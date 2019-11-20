package algorithmstudy.backjun;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Backjun1181 {

	/*
	 	알파벳 소문자로 이루어진 N개의 단어가 들어오면 
	 	길이가 짫은 것부터
	 	길이가 같으면 사전 순으로
	 	정렬하시오
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		String[] input = new String[number];
		for(int i = 0; i < number; i++) {
			input[i] = sc.nextLine();
		}
		
		Arrays.sort(input, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int result = 0;
				if(o1.length() < o2.length()) {
					result = -1;
				}else if(o1.length() > o2.length()) {
					result = 1;
				}else {
					result = o1.compareTo(o2); 
				}
				return result;
			}
		});
		
		for(int i = 0; i < number; i++) {
			System.out.println(input[i]);
		}
		
		sc.close();
	} 
}
