package stacksAndQueues;

public class TestMyStack {
	public static void main(String args[]) {
		MyStack<Integer> mystack = new MyStack<>();

		mystack.push(1);
		mystack.push(2);
		mystack.push(3);
		mystack.push(4);
		mystack.pop();
		mystack.pop();
		mystack.push(5);
		mystack.push(6);
		mystack.push(7);
		mystack.pop();
		mystack.push(8);

		mystack.display();
	}
}
