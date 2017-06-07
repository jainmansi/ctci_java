package linkedlistQuestions;

import java.util.HashSet;

public class RemoveDups {

	public static void main(String args[]) {
		Linkedlist list = new Linkedlist();

		list.append(1);
		list.append(1);
		list.append(2);
		list.append(2);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(3);
		list.append(7);
		list.append(3);
		list.append(4);
		list.append(9);
		list.append(5);
		removeDuplicates(list);
	}

	@SuppressWarnings("unused")
	public static void removeDuplicates(Linkedlist list) {
		HashSet<Integer> values = new HashSet<>();

		Node current = list.head;

		if (list == null) {
			System.out.println("Cannot remove duplicates from empty list");
			return;
		}

		values.add(list.head.data);

		while (current.next != null) {
			if (!values.contains(current.next.data)) {
				values.add(current.next.data);
				current = current.next;
			} else {
				current.next = current.next.next;
			}
		}
		list.display();
	}
}
