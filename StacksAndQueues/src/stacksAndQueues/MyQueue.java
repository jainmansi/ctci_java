package stacksAndQueues;

import java.util.EmptyStackException;

import stacksAndQueues.MyStack.StackNode;

public class MyQueue<T> {

	// Node class for each element in the queue
	public class QueueNode<T> {
		private T data;
		private QueueNode<T> next;

		QueueNode(T data) {
			this.data = data;
			this.next = null;
		}

		QueueNode() {
			this.data = null;
			this.next = null;
		}
	}

	QueueNode head = new QueueNode<T>();
	int size = 0;

	// To enqueue value in the queue
	public void enqueue(T data) {
		QueueNode new_node = new QueueNode<>(data);
		if (head == null) {
			head = new_node;
			this.size++;
			return;
		}
		QueueNode current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new_node;
		this.size++;
	}

	// To dequeue value from the queue
	public QueueNode dequeue() {
		if (head == null) {
			throw new EmptyStackException();
		}
		QueueNode item = head;
		head = head.next;
		this.size--;
		return item;
	}

	// return's head of the queue
	public QueueNode getHead() {
		return head;
	}

	// return's size of the queue
	public int getSize() {
		return size;
	}

}
