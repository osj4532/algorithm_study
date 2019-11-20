package algorithmstudy.datastructure.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import algorithmstudy.datastructure.Edge;
import algorithmstudy.datastructure.Kruskal;

public class KruskalTest {

	public static void main(String[] args) {
		int n = 7;
		
		List<Edge> edges = new ArrayList<Edge>();
		edges.add(new Edge(1, 7, 12));
		edges.add(new Edge(1, 5, 17));
		edges.add(new Edge(1, 2, 67));
		edges.add(new Edge(1, 4, 28));
		edges.add(new Edge(2, 4, 24));
		edges.add(new Edge(2, 5, 62));
		edges.add(new Edge(3, 5, 20));
		edges.add(new Edge(3, 6, 37));
		edges.add(new Edge(4, 7, 13));
		edges.add(new Edge(5, 6, 45));
		edges.add(new Edge(5, 7, 73));
		
		//간선의 비용을 기준으로 오름차순 정렬
		Collections.sort(edges);
		
		//각 정점이 포함된 그래프가 어디인지 저장
		int[] parent = new int[n];
		for(int i = 0; i < n; i++) {
			parent[i] = i;
		}
		
		int sum = 0;
		Kruskal k = new Kruskal();
		for(int i = 0; i < edges.size(); i++) {
			Edge item = edges.get(i);
			if(k.findParent(parent, item.node[0] - 1, item.node[1] - 1) != 1) {
				sum += item.distance;
				k.unionParent(parent, item.node[0] - 1, item.node[1] - 1);
			}
		}
		
		System.out.println(sum);
	}

}
