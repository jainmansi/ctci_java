package stacksAndQueues;

public class StackOfPlates {
	
	private static MyStack<MyStack> stackOfStacks = new MyStack<>();
	private static MyStack s = new MyStack<>();
	private static final int THRESHOLD = 5;
	private static int currentCount = 0;
	
	public static void main(String args[]) {
		push(3);
		push(4);
		push(5);
		push(6);
		push(7);
		push(8);
		
		display();
		
		stackOfStacks.push(s);
		
	}
	
	public static void push(int data) {
		MyStack current = stackOfStacks.peek();
		if(current.size <= currentCount) {
			current.push(data);
		} else {
			MyStack newStack = new MyStack();
			newStack.push(data);
			stackOfStacks.push(newStack);
		}
	}
	
	public static void pop() {
		MyStack current = stackOfStacks.peek();
		current.pop();
		if(current.size == 0 && stackOfStacks.size > 1) {
			stackOfStacks.pop();
		}
	}
	
	public static void display() {
		MyStack<MyStack> toDisplay = new MyStack<>();
		MyStack current = toDisplay.peek();
		while(current != null){
			current.display();
			System.out.println("------");
			current = toDisplay.pop();
		}
	}
	
}
