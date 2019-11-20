package algorithmstudy.datastructure.test;

import algorithmstudy.datastructure.UnionFind;

public class UnionFindTest {

	public static void main(String[] args) {
		UnionFind unionFind = new UnionFind();
		int[] parent = new int[11];
		//전부 개별 적인 원소
		for(int i = 1; i <= 10; i++) {
			parent[i] = i;
		}
		unionFind.unionParent(parent, 1, 2);
		unionFind.unionParent(parent, 2, 3);
		unionFind.unionParent(parent, 3, 4);
		unionFind.unionParent(parent, 5, 6);
		unionFind.unionParent(parent, 6, 7);
		unionFind.unionParent(parent, 7, 8);
		
		System.out.println("1과 5는 연결되어 있는가?");
		System.out.println(unionFind.findParent(parent, 1, 5));
		unionFind.unionParent(parent, 1, 5);
		System.out.println(unionFind.findParent(parent, 1, 5));
	}

}
