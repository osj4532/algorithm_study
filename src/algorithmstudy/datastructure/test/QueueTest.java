package algorithmstudy.datastructure.test;

import algorithmstudy.datastructure.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue que = new Queue();
		for(int i = 0; i < 11; i++) {
			que.add(i+1);
		}
		
		while(!que.isEmpty()) {
			System.out.println(que.poll());
		}
		
		que.poll();
	}

}
