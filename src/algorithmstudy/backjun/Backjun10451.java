package algorithmstudy.backjun;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Backjun10451 {

	static int[] arr;
	static int[] visit;
	
	public static void dfs(int start) {
		if(visit[start] == 1) return;
		
		visit[start] = 1;
		int now = arr[start];
		dfs(now);
	}
	
	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(arr[start]);
		visit[start] = 1;
		
		while(!q.isEmpty()) {
			int now = q.poll();
			
			if(visit[now] == 0) {
				q.offer(arr[now]);
				visit[now] = 1;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			int count = 0;
			
			int N = sc.nextInt();
			arr = new int[N + 1];
			visit = new int[N + 1];
			
			for(int j = 1; j <= N; j++) {
				arr[j] = sc.nextInt();
			}
			
			
			for(int j = 1; j <= N; j++) {
				if(visit[j] == 0) {
					//dfs(j);
					bfs(j);
					count++;
				}
			}
			System.out.println(count);
		}
		
		sc.close();
	}

}
