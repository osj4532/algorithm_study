package algorithmstudy.book;

public class IntConvertString {

	public static String intToString(int in) {
		StringBuilder sb = new StringBuilder();
		boolean isNeg = false;
		
		if(in < 0) {
			if(in == Integer.MIN_VALUE)
				return "-2147483648";
			isNeg = true;
			in *= -1;
		}
		
		while(in > 0) {
			sb.append(in%10);
			in /= 10;
		}
	
		if(isNeg)
			sb.append("-");
		
		return sb.reverse().toString();
	}
	
	public static int StringToInt(String in) {
		int len = in.length();
		int result = 0, num = 0;
		boolean isNeg = false;
		
		if(in.charAt(0) == '-') {
			isNeg = true;
			num++;
		}
		
		while(num < len) {
			result *= 10;
			result += in.charAt(num++) - '0';
		}
		
		if(isNeg)
			result *= -1;
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(StringToInt("1"));
		System.out.println(intToString(-12));
	}

}
