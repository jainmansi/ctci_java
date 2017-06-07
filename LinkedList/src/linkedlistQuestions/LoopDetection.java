package linkedlistQuestions;

public class LoopDetection {
	
	public static void main(String args[]){
		Linkedlist list = new Linkedlist();
		
		Node n1 = new Node(0);
		Node n2 = new Node(1);
		Node n3 = new Node(2);
		Node n4 = new Node(3);
		Node n5 = new Node(4);
		Node n6 = new Node(5);
		Node n7 = new Node(6);
		
		list.appendNode(n1);
		list.appendNode(n2);
		list.appendNode(n3);
		list.appendNode(n4);
		list.appendNode(n5);
		list.appendNode(n6);
		list.appendNode(n3);
		
		System.out.println("List has loop? " +hasLoop(list));
	}

	public static boolean hasLoop(Linkedlist list){
		
		Node slow = list.head;
		Node fast = list.head;
		
		while(slow != null && fast != null){
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast)
				return true;
		}
		return false;
	}
}
