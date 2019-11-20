package algorithmstudy.search.test;

import algorithmstudy.search.DFS;

public class DFSTest {

	public static void main(String[] args) {
		DFS dfs = new DFS();
		
		int[][] arr = {
				{0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 1, 1, 0, 0, 0, 0},				
				{0, 1, 0, 1, 1, 1, 0, 0},
				{0, 1, 1, 0, 0, 0, 1, 1},
				{0, 0, 1, 0, 0, 1, 0, 0},
				{0, 0, 1, 0, 1, 0, 0, 0},
				{0, 0, 0, 1, 0, 0, 0, 1},
				{0, 0, 0, 1, 0, 0, 1, 0}
		};
		dfs.dfs(arr, 1);
	}

}
