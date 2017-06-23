package stacksAndQueues;

public class TestQueueViaStacks {
	 
	public static void main(String[] args) {
		QueueViaStacks<Integer> qs = new QueueViaStacks<>();
		qs.enqueue(2);
		qs.enqueue(3);
		qs.enqueue(4);
		
		
		System.out.println(qs.dequeue());
		System.out.println(qs.dequeue());
		
		qs.enqueue(5);
		qs.enqueue(6);
		
		//System.out.println(qs.dequeue());
	}
}
