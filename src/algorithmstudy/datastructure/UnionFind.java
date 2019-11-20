package algorithmstudy.datastructure;

public class UnionFind {
	// 부모 노드를 찾는 함수
	public int getParent(int[] parent, int x) {
		if(parent[x] == x) return x;
		return parent[x] = getParent(parent, parent[x]);
	}
	
	// 두 부모 노드를 합치는 함수
	public void unionParent(int[] parent, int a, int b) {
		a = getParent(parent, a);
		b = getParent(parent, b);
		if(a < b) {
			parent[b] = a;
		}else {
			parent[a] = b;
		}
	}
	
	// 같은 부모를 가지는지 확인
	public int findParent(int[] parent, int a, int b) {
		a = getParent(parent, a);
		b = getParent(parent, b);
		if(a == b) return 1;
		return 0;
	}
}
