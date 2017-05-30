package linkedlistQuestions;

public class TestList {
	
	public static void main(String args[]){
		Linkedlist testlist = new Linkedlist();
		
		testlist.append(1);
		testlist.append(2);

		testlist.push(4);
		
		testlist.insertAtAPosition(8, 1);
		
		testlist.append(14);
		testlist.append(20);
		testlist.append(3);
		testlist.append(9);
		testlist.append(7);
		
		testlist.deleteANode(14);
		testlist.removeFirst();
		
		testlist.removeLast();
		testlist.display();
	}

}
