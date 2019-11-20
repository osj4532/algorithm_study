package algorithmstudy.backjun;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}

public class Backjun2583 {

	static int map[][];
	static int visited[][];
	static int[] counter;
	static int localCount = 0;
					 //상 하 우 좌
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	
	static int M, N;
	
	public static boolean isIn(int y, int x) {
		boolean result = false;
		if(y >= 0 && y < N && x >= 0 && x < M) {
			result = true;
		}
		return result;
	}
	
	public static void bfs(int x, int y) {
		Queue<Point> q = new LinkedList<Point>();
		q.offer(new Point(x, y));
		visited[x][y] = 1;
		localCount++;
		
		while(!q.isEmpty()) {
			Point nowP = q.poll();
			for(int i = 0; i < dx.length; i++) {
				int nowX = nowP.getX() + dx[i];
				int nowY = nowP.getY() + dy[i];
				
				if(isIn(nowY, nowX) && map[nowX][nowY] == 0
						&& visited[nowX][nowY] == 0) {
					q.offer(new Point(nowX, nowY));
					visited[nowX][nowY] = 1;
					localCount++;
				}
			}
		}
	}
	
	public static void dfs(int x, int y) {
		if(visited[x][y] == 1) return;
		
		visited[x][y] = 1;
		localCount++;
		
		for(int i = 0; i < dx.length; i++) {
			int newX = x + dx[i];
			int newY = y + dy[i];
			
			if(isIn(newY, newX) && map[newX][newY] == 0) {
				dfs(newX, newY);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		M = sc.nextInt();
		N = sc.nextInt();
		int K = sc.nextInt();
		
		map = new int[M][N];
		visited = new int[M][N];
		
		for(int i = 0; i < K; i++) {
			int bX = sc.nextInt();
			int bY = sc.nextInt();
			int tX = sc.nextInt();
			int tY = sc.nextInt();
			
			for(int j = bX; j < tX; j++) {
				for(int t = bY; t < tY; t++) {
					map[t][j] = 1;
				}
			}
		}
		
		int count = 0;
		counter = new int[M*N/2];
		int cidx = 0;
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if(visited[i][j] == 0 && 
						map[i][j] == 0) {
					//dfs(i,j);
					bfs(i,j);
					count++;
					counter[cidx++] = localCount;
					localCount = 0;
				}
			}
		}
		
		System.out.println(count);
		
        Arrays.sort(counter);
		int len = counter.length;
		for(int i = len-count; i < len; i++) {
			System.out.print(counter[i] + " ");
		}
		sc.close();
	}

}
