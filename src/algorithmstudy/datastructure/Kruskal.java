package algorithmstudy.datastructure;
/*
 	가장 적은 비용으로 모든 노드를 연결
 */
public class Kruskal {
	public int getParent(int[] parent, int x) {
		if(parent[x] == x) return x;
		return parent[x] = getParent(parent, parent[x]);
	}
	
	public void unionParent(int[] parent, int a, int b) {
		a = getParent(parent, a);
		b = getParent(parent, b);
		if(a > b)
			parent[a] = b;
		else
			parent[b] = a;
	}
	
	public int findParent(int[] parent, int a, int b) {
		a = getParent(parent, a);
		b = getParent(parent, b);
		if(a == b) return 1;
		return 0;
	}
}
