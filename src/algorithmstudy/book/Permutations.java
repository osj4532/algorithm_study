package algorithmstudy.book;

public class Permutations {
	
	private boolean[] used;
	private StringBuilder out = new StringBuilder();
	private String in;
	
	public Permutations(String str) {
		in = str;
		used = new boolean[str.length()];
	}
	
	public void permutate() {
		if(in.length() == out.length()) {
			System.out.println(out.toString());
			return;
		}
		
		for(int i = 0; i < in.length(); i++) {
			if(used[i]) continue;
			out.append(in.charAt(i));
			used[i] = true;
			permutate();
			used[i] = false;
			out.setLength(out.length() - 1);
		}
	}
	
	public static void main(String[] args) {
		Permutations p = new Permutations("abcd");
		p.permutate();

	}

}
