package algorithmstudy.book;

public class DeleteAllSpecialChar {
	
	
	
	public static void main(String[] args) {
		String str = "Battle of the Vowels: Hawai vs. Grozny";
		String remove = "aeiou";
		
		StringBuffer sb = new StringBuffer(str);
		boolean[] flags = new boolean[128];
		
		for(char c : remove.toCharArray()) {
			flags[c] = true;
		}
		
		int dst = 0;
		for(int i = 0; i < sb.length(); i++) {
			if(!flags[sb.charAt(i)]) {
				sb.setCharAt(dst++, sb.charAt(i));
			}
		}		
		String cvt = str.replaceAll("[" + remove + "]", "");
		System.out.println(cvt);
	}

}
