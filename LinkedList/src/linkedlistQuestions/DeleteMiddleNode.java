package linkedlistQuestions;

public class DeleteMiddleNode {
	public static void main(String args[]) {
		Linkedlist list = new Linkedlist();

		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		list.append(6);
		list.append(7);
		list.append(8);
		list.append(9);
		list.append(10);

		list.display();

		Node current = list.head;

		int size = list.getSize();
		int middle = size / 2 - 1;

		for (int i = 0; i < middle; i++) {
			current = current.next;
		}

		System.out.println("");
		System.out.println("The node to delete is: " + current.data);

		deleteMiddleNode(current);

		System.out.println("");
		list.display();
	}

	public static void deleteMiddleNode(Node current) {

		if (current.next == null) {
			return;
		}

		current.data = current.next.data;
		current.next = current.next.next;
		return;

	}
}
