package algorithmstudy.search;

public class DFS {
	
	private int[] visit;
	
	public void dfs(int[][] arr, int start) {
		if(visit == null) {
			visit = new int[arr.length];
		}
		
		if(visit[start] == 1) return;
		
		visit[start] = 1;
		System.out.println(start);
		
		for(int i = 0; i < arr.length; i++) {
			int now = arr[start][i];
			if(now != 0 && visit[i] == 0) {
				dfs(arr, i);
			}
		}
	}
}
