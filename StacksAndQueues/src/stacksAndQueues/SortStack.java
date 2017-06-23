package stacksAndQueues;

public class SortStack {

	public static void main(String[] args) {
		MyStack<Integer> stack = new MyStack<>();
		sortPush(stack, 99);
		stack.display();
		sortPush(stack, 1);
		stack.display();
		sortPush(stack, 45);
		stack.display();
		sortPush(stack, 23);
		stack.display();
		sortPush(stack, 27);
		stack.display();
		sortPush(stack, 15);
		stack.display();
		sortPush(stack, 9);
		stack.display();
		sortPush(stack, 78);
		stack.display();
		sortPush(stack, 31);
		stack.display();
		sortPush(stack, 5);
		stack.display();
		sortPush(stack, 11);
		
		stack.display();
	}
	
	static void sortPush(MyStack<Integer> stack, int data) {
		MyStack<Integer> tempStack = new MyStack<>();
		
		if(stack.size == 0) {
			stack.push(data);
			return;
		}
		
		else if(stack.peek() < data) {
			while (stack.peek() < data) {
				tempStack.push(stack.pop());
			}
			stack.push(data);
			while (!tempStack.isEmpty()) {
				stack.push(tempStack.pop());
			}
			return;
		}
		stack.push(data);
		return;
		
	}
}
