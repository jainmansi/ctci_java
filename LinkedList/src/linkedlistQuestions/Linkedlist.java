package linkedlistQuestions;

public class Linkedlist {

	Node head;
	int size;

	public Linkedlist() {
		this.head = null;
		this.size = 0;
	}

	// insert in the beginning of the list
	public void push(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			this.size++;
			return;
		}

		newNode.next = head;
		head = newNode;
		this.size++;
	}

	// insert at the end of the list
	public void append(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			this.size++;
			return;
		}

		Node last = head;

		while (last.next != null) {
			last = last.next;
		}
		last.next = newNode;
		this.size++;
	}

	// insert at a given index position
	public void insertAtAPosition(int data, int position) {
		if (this.size - position < -1 || position < -1) {
			System.out.println("Not a valid position");
			return;
		}

		if (position == 0) {
			push(data);
			return;
		}

		int i = 0;

		Node newNode = new Node(data);
		Node current = head;

		while (i < position) {
			current = current.next;
			i++;
		}
		newNode.next = current.next;
		current.next = newNode;
		this.size++;
	}

	// insert after a given node
	public void insertAfterANode(int data, Node prevNode) {
		if (prevNode == null) {
			System.out.println("Previous Node cannot be null");
			return;
		}
		Node newNode = new Node(data);

		newNode.next = prevNode.next;
		prevNode.next = newNode;
		this.size++;
	}

	// Delete a given node
	public void deleteANode(int key) {
		Node current = head;
		Node prev = null;

		if (current != null && current.data == key) {
			head = head.next;
			this.size--;
			return;
		}

		while (current != null && current.data != key) {
			prev = current;
			current = current.next;
		}

		if (current == null)
			return;

		prev.next = current.next;
		this.size--;
	}

	//remove element from the beginning of the list
	public void removeFirst() {
		if(head == null)
			return;
		head = head.next;
		this.size--;
	}
	
	//remove last element from the list
	public void removeLast(){
		Node current = head;
		
		if(current == null){
			return;
		}
		
		while(current.next.next != null){
			current = current.next;
		}
		current.next = null;
		this.size--;
	}
	
	//get the head of the list
	public Node getHead(){
		if(head == null)
			return null;
		return head;
	}
	
	//get the size of the list
	public int getSize(){
		return this.size;
	}
	
	//Display all the elements of the list
	public void display(){
		Node current = head;
		if(current == null){
			System.out.println("Empty linked list");
		}
		
		while(current != null){
			System.out.print(current.data+"->");
			current = current.next;
		}
		System.out.print("X");
	}

}
