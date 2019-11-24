package algorithmstudy.book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SkillTrees {

	public static void main(String[] args) {
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		String skill = "CBD";
		
		ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
		Iterator<String> it = skillTrees.iterator();
		
		while(it.hasNext()) {
			if(skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
				it.remove();
			}
		}
		
		int answer = skillTrees.size();
		System.out.println(answer);
		String tmp = "BACDE".replaceAll("[^" + skill + "]", "");
		System.out.println("BACDE, "+tmp);
		
	}

}
