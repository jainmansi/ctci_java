package stacksAndQueues;


public class StackMin{
	private static MyStack minStack = new MyStack();
	private static MyStack myStack = new MyStack();
	
	public static void main(String args[]) {
		add(4);
		add(7);
		add(15);
		add(3);
		add(43);
		
		myStack.display();
		System.out.println("");
		System.out.println("Min value at this point is: "+ min());
		System.out.println("");
		
		add(1);
		
		myStack.display();
		System.out.println("");
		System.out.println("Min value at this point is: "+ min());
		System.out.println("");
		
		remove();
		
		myStack.display();
		System.out.println("");
		System.out.println("Min value at this point is: "+ min());
		System.out.println("");
		
		add(6);
		add(3);
		remove();
		add(12);
		
		myStack.display();
		System.out.println("");
		System.out.println("Min value at this point is: "+ min());
		System.out.println("");
		
	}

	public static void add(int data) {
		if(minStack == null){
			minStack.push(data);
		}
		if (min() > data) {
			minStack.push(data);
		}
		myStack.push(data);
	}

	public static int min() {
		try{
			return (int) minStack.peek();
		} catch (Exception e) {
			return Integer.MAX_VALUE;
		}
	}

	public static void remove() {
		if (myStack.peek() == minStack.peek()) {
			myStack.pop();
			minStack.pop();
		} else {
			myStack.pop();
		}
	}
}
