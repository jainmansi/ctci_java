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
	}

	QueueNode first;
	QueueNode last;
	int size = 0;

	// To enqueue value in the queue
	public void enqueue(T data) {
		QueueNode new_node = new QueueNode<>(data);
		QueueNode current = last;
		if (last == null) {
			current = new_node;
			last = new_node;
			first = new_node;
			this.size++;
			return;
		}
		last = new_node;
		current.next = new_node;
		this.size++;
	}

	// To dequeue value from the queue
	public QueueNode dequeue() {
		if (first == null) {
			throw new EmptyStackException();
		}
		QueueNode item = first;
		first = first.next;
		this.size--;
		return item;
	}

	// return's first element of the queue
	public QueueNode getFirst() {
		return first;
	}

	// return's last element of the queue
	public QueueNode getLast() {
		return last;
	}

	// return's size of the queue
	public int getSize() {
		return size;
	}

	// displays entire queue
	public void display() {
		QueueNode<T> currentNode = getFirst();
		while (currentNode != null) {
			System.out.print(currentNode.data);
			System.out.print("->");
			currentNode = currentNode.next;
		}
		System.out.print("X");
	}

}
