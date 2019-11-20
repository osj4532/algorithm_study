package algorithmstudy.backjun;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Backjun1431 {

	public static int compareLen(String str1, String str2) {
		int result = 0;
		int len1 = str1.length();
		int len2 = str2.length();
		
		if(len1 > len2) {
			result = 1;
		}else if(len1 < len2) {
			result = -1;
		}
		return result;
	}
	
	public static int compareSum(String str1, String str2) {
		int result = 0;
		int sum1 = getSum(str1);
		int sum2 = getSum(str2);
		
		if(sum1 > sum2) {
			result = 1;
		}else if(sum1 < sum2) {
			result = -1;
		}
		return result;
	}
	
	public static int getSum(String str) {
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			char item = str.charAt(i);
			if('0' <= item && item <= '9') {
				sum += Integer.parseInt(item+"");
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		String[] serials = new String[N];
		
		for(int i = 0; i < serials.length; i++) {
			serials[i] = sc.nextLine();
		}
		
		Arrays.sort(serials, new Comparator<String>() {
			public int compare(String o1, String o2) {
				int result = compareLen(o1, o2);
				if(result == 0) {
					result = compareSum(o1, o2);
					if(result == 0) {
						result = o1.compareTo(o2);
					}
				}
				return result;
			}
		});
		
		for(String str : serials) {
			System.out.println(str);
		}
		
		sc.close();
	}

}
