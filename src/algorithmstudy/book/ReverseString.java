package algorithmstudy.book;

public class ReverseString {

	public static String reverse(String str) {
		StringBuilder out = new StringBuilder();
		for(int i = str.length() - 1; i >= 0; i--) {
			out.append(str.charAt(i));
		}
		return out.toString();
	}
	
	public static void main(String[] args) {
		String in = "Hello, World!";
		System.out.println(reverse(in));
	}

}
