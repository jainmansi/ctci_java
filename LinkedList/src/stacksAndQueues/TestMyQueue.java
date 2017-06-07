package stacksAndQueues;

public class TestMyQueue {

	public static void main(String args[]) {
		MyQueue<Integer> myqueue = new MyQueue<>();
		myqueue.display();
		System.out.println("");

		myqueue.enqueue(1);
		myqueue.enqueue(2);
		myqueue.enqueue(3);
		myqueue.enqueue(4);
		myqueue.enqueue(5);
		myqueue.enqueue(6);

		myqueue.display();
		System.out.println("");

		myqueue.dequeue();
		myqueue.dequeue();

		myqueue.display();
		System.out.println("");

		myqueue.enqueue(7);

		myqueue.display();
		System.out.println("");

		myqueue.dequeue();
		myqueue.dequeue();

		myqueue.display();
		System.out.println("");

		myqueue.enqueue(8);
		myqueue.enqueue(9);
		myqueue.enqueue(10);

		myqueue.display();
	}
}
