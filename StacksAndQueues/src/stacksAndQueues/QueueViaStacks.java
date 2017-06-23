package stacksAndQueues;

import java.util.Stack;

public class QueueViaStacks<T> {
	Stack<T> stack1;
	Stack<T> stack2;
	
	public QueueViaStacks() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}
	
	void enqueue(T data) {
		stack1.push(data);
	}
	
	T dequeue() {
		shuffleStack();
		return stack2.pop();
	}
	
	void shuffleStack() {
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
	}
}
