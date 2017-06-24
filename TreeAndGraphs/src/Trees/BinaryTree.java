package Trees;

public class BinaryTree {

	Node root;
	
	public BinaryTree(int data) {
		root = new Node(data);
	}
	
	public BinaryTree() {
		root = null;
	}
	
	public Node getRoot() {
		return root;
	}
}
