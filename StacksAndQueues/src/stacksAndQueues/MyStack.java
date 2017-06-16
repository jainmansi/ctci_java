package stacksAndQueues;

import java.util.EmptyStackException;

public class MyStack<T> {

	// Node class for each element in the stack
	public class StackNode<T> {
		private T data;
		private StackNode<T> next;

		StackNode(T data) {
			this.data = data;
			this.next = null;
		}

		StackNode() {
			this.data = null;
			this.next = null;
		}
	}

	StackNode head = new StackNode<T>();
	int size = 0;

	// Method to push elements in the stack
	public void push(T data) {
		StackNode new_node = new StackNode<>(data);
		if (head.data == null) {
			head = new_node;
			this.size++;
			return;
		}
		new_node.next = head;
		head = new_node;
		this.size++;
	}

	// Method to pop elements out of the stack
	public T pop() {
		if (head.data == null) {
			throw new EmptyStackException();
		}
		StackNode<T> item = new StackNode<>();
		item = head;
		head = head.next;
		this.size--;
		return item.data;
	}

	// Method to get the head of the stack
	public T peek() {
		if (head.data == null) {
			throw new EmptyStackException();
		}
		return (T) head.data;
	}

	// return's head of the stack
	public StackNode getHead() {
		return head;
	}

	// return's size of the stack
	public int getSize() {
		return size;
	}

	// displays entire stack
	public void display() {
		StackNode<T> node = getHead();
		while (node != null) {
			System.out.print(node.data);
			System.out.print("->");
			node = node.next;
		}
		System.out.print("X");
		System.out.println("");
	}

}
