package algorithmstudy.book;

public class ReverseWords {
	
	public static void reverseString(char[] str, int start, int end) {
		while(start < end) {
			char tmp = str[start];
			str[start] = str[end];
			str[end] = tmp;
			start++; end--;
		}
	}
	
	public static void reverseWords(char[] str) {
		int start = 0, end = 0, len = str.length;
		reverseString(str, start, len - 1);
		
		while(end < len) {
			if(str[end] != ' ') {
				start = end;
				
				while(end < len && str[end] != ' ') {
					end++;
				}
				end--;
				reverseString(str, start, end);
			}
			end++;
		}
	}
	
	
	public static void main(String[] args) {
		String str = "Do or do not, there is no try.";
		
		StringBuilder sb = new StringBuilder();
		String[] words = str.split(" ");
		for(int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i]+" ");
		}
		
		System.out.println(sb.toString());
		
		//use buffer
		char[] buffer = new char[str.length()];
		int slen, tokenReadPos, wordReadPos, wordEnd, writePos = 0;
		char[] strs = str.toCharArray();
		
		slen = strs.length;
		tokenReadPos = slen - 1;
		
		while(tokenReadPos >= 0) {
			if(strs[tokenReadPos] == ' ') {
				buffer[writePos++] = strs[tokenReadPos--];
			}else {
				wordEnd = tokenReadPos;
				while(tokenReadPos >= 0 && strs[tokenReadPos] != ' ') {
					tokenReadPos--;
				}
				wordReadPos = tokenReadPos + 1;
				
				while(wordReadPos <= wordEnd) {
					buffer[writePos++] = strs[wordReadPos++];
				}
			}
		}
		
		for(int i = 0; i < buffer.length; i++) {
			System.out.print(buffer[i]);
		}
		
		//no buffer
		System.out.println();
		char[] strs2 = str.toCharArray();
		reverseWords(strs2);
		
		for(int i = 0; i < strs2.length; i++) {
			System.out.print(strs2[i]);
		}
	}

}
