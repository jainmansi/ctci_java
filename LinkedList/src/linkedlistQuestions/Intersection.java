package linkedlistQuestions;

public class Intersection {
	
	public static void main(String args[]){
		Linkedlist small = new Linkedlist();
		Linkedlist big = new Linkedlist();
		
		Node n1 = new Node(0);
		Node n2 = new Node(1);
		Node n3 = new Node(2);
		
		Node n4 = new Node(3);
		Node n5 = new Node(4);
		Node n6 = new Node(5);
		
		small.appendNode(n4);
		small.appendNode(n5);
		small.appendNode(n6);
		
		big.appendNode(n1);
		big.appendNode(n2);
		big.appendNode(n3);
		big.appendNode(n4);
		
		small.display();
		System.out.println("");
		big.display();
		
		Node result = intersectingNode(small, big);
		
		System.out.println("");
		System.out.println("The value at intersecting node is: " +result.data);
	}

	public static Node intersectingNode(Linkedlist list1, Linkedlist list2){
		
		int len1 = list1.getSize();
		int len2 = list2.getSize();
		int diff = 0;
		Node bigNode = null;
		Node smallNode = null;
		if(len2 > len1){
			bigNode = list2.head;
			smallNode = list1.head;
			diff = len2 - len1;
		}
		else{
			bigNode = list1.head;
			smallNode = list2.head;
			diff = len1 - len2;
		}
		for(int i = 0; i < diff; i++){
			bigNode = bigNode.next;
		}
		while(bigNode != null && smallNode != null){
			if(bigNode == smallNode)
				return bigNode;
			else{
				bigNode = bigNode.next;
				smallNode = smallNode.next;
			}
		}
		return null;
	}
}
