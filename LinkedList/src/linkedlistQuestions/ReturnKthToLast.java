package linkedlistQuestions;

public class ReturnKthToLast {

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
		int result = returnKthLast(list, 4);
		int result_2Pointers = returnKthLast_2Pointers(list, 4);
		
		System.out.println("Output using the size: " +result);
		System.out.println("Output using 2 pointers: " +result_2Pointers);
	}

	public static int returnKthLast(Linkedlist list, int position) {

		Node current = list.getHead();

		int size = list.getSize();
		if (position > size) {
			System.out.println("Invalid Position");
			return list.head.data;
		}
		
		int posFromFront = size - position;
		int counter = 0;

		while (counter < posFromFront) {
			current = current.next;
			counter++;
		}
		return current.data;
	}
	
	public static int returnKthLast_2Pointers(Linkedlist list, int position) {

		Node heading = list.getHead();
		Node tailing = list.getHead();

		for(int i = 0; i < position; i++){
			heading = heading.next;
			if(heading.next == null){
				return heading.data;
			}
		}
		
		while(heading.next != null){
			heading = heading.next;
			tailing = tailing.next;
		}
		
		return tailing.next.data;
		
	}
}
