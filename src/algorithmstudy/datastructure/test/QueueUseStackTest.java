package algorithmstudy.datastructure.test;

import algorithmstudy.datastructure.QueueUseStack;

public class QueueUseStackTest {

	public static void main(String[] args) {
		QueueUseStack qus = new QueueUseStack();
		qus.push(1);
		qus.push(2);
		qus.push(3);
		qus.push(4);

		while(!qus.isEmpty()) {
			System.out.println(qus.pop());
		}
	}

}
