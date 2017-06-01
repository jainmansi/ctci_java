package linkedlistQuestions;

public class Partition {

	public static void main(String args[]) {
		Linkedlist list = new Linkedlist();

		list.append(13);
		list.append(12);
		list.append(1);
		list.append(3);
		list.append(5);
		list.append(8);
		list.append(5);
		list.append(10);
		list.append(2);
		list.append(1);
		list.append(4);

		partition(list, 5);
	}

	public static void partition(Linkedlist list, int partition) {
		Node current = list.getHead();

		while (current.next != null) {
			if (current.data < partition) {
				list.push(current.data);
				current.data = current.next.data;
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
		if(current.data < partition){
			list.push(current.data);
			list.removeLast();
		}
		list.display();
	}
}
