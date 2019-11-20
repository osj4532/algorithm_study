package algorithmstudy.search;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	
	public void bfs(int[][] arr, int start) {
		int[] visit = new int[arr.length];
		Queue<Integer> que = new LinkedList<Integer>();
		
		que.offer(start);
		visit[start] = 1;
		
		while(!que.isEmpty()) {
			int tmp = que.poll();
			System.out.println(tmp);
			
			for(int i = 0; i < arr[start].length; i++) {
				if(arr[tmp][i] != 0 && visit[i] == 0) {
					que.offer(i);
					visit[i] = 1;
				}
			}
		}
	}
}
