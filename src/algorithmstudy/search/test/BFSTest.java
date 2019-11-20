package algorithmstudy.search.test;

import algorithmstudy.search.BFS;

public class BFSTest {

	public static void main(String[] args) {
		BFS bfs = new BFS();
		
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
		bfs.bfs(arr, 1);
		
	}

}
