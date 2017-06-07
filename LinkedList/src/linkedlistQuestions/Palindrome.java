package linkedlistQuestions;

public class Palindrome {

	public static void main(String args[]){
		Linkedlist list1 = new Linkedlist();

		list1.append(1);
		list1.append(2);
		list1.append(3);
		list1.append(2);
		list1.append(1);
		
		System.out.println("Is Palindrome?" +isPanlindrome(list1));

		Linkedlist list2 = new Linkedlist();

		list2.append(9);
		list2.append(8);
		list2.append(9);
		list2.append(9);

		System.out.println("Is Palindrome?" +isPanlindrome(list2));
		
	}
	
	public static boolean isPanlindrome(Linkedlist list){
		Linkedlist reversed = new Linkedlist();
		Node node = list.head;
		while(node != null){
			reversed.append(node.data);
			node = node.next;
		}
		
		if(reversed.head == null){
			return true;
		}

		Node next = null;
		Node current = reversed.getHead();
		Node prev = null;
		
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		reversed.head = prev;
		
		reversed.display();
		boolean isEqualResult = isEqual(list, reversed);

		return isEqualResult;
	}
	
	public static boolean isEqual(Linkedlist list, Linkedlist reversed){
		Node curr1 = list.getHead();
		Node curr2 = reversed.getHead();
		
		if(list.size != reversed.size){
			return false;
		}
		
		else{
			while(curr1.next != null && curr2 != null){
				if(curr1.data != curr2.data){
					return false;
				}
				curr1 = curr1.next;
				curr2 = curr2.next;
			}
		}
		return true;
	}
}
