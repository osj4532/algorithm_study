package algorithmstudy.datastructure;

public class Edge implements Comparable<Edge>{
	public int[] node = new int[2];
	public int distance;
	
	public Edge(int a, int b, int distance) {
		this.node[0] = a;
		this.node[1] = b;
		this.distance = distance;
	}

	@Override
	public int compareTo(Edge o) {
		if(this.distance > o.distance) {
			return 1;
		}else if(this.distance < o.distance) {
			return -1;
		}else {
			return 0;
		}
	}
}
