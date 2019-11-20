package algorithmstudy.book;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeleteDuplicate {

	//중복시 순서 상관 없다면
	public static List<Integer> deleteDup(List<Integer> in){
		Set<Integer> outSet = new HashSet<Integer>();
		for(Integer item : in) {
			outSet.add(item);
		}
		
		List<Integer> out = new ArrayList<Integer>();
		out.addAll(outSet);
		return out;
	}
	
	//중복시 순서 중요하다면
	public static List<Integer> removeDup(List<Integer> in){
		List<Integer> out = new ArrayList<Integer>();
		for(Integer item : in) {
			if(!out.contains(item)) {
				out.add(item);
			}
		}
		return out;
	}
	
	public static void main(String[] args) {
		List<Integer> in = new ArrayList<Integer>();
		for(int i = 0; i < 30; i++) {
			int random = (int)(Math.random() * 30) + 1;
			in.add(random);
		}
		
		for(int item : in) {
			System.out.print(item+" ");
		}
		System.out.println();
		
		for(int item : deleteDup(in)) {
			System.out.print(item+" ");
		}
		System.out.println();
		
		for(int item : removeDup(in)) {
			System.out.print(item+" ");
		}
		System.out.println();
	}

}
