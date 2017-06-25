package Trees;

public class BinarySearchTree {

	class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	Node root;

	public BinarySearchTree() {
		root = null;
	}

	public void insertData(int data) {
		root = addNode(root, data);
	}

	public Node addNode(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		}

		if (root.data > data) {
			root.left = addNode(root.left, data);
		} else {
			root.right = addNode(root.right, data);
		}

		return root;
	}
	
	public void printInorder(Node root) {
		if(root != null) {
			printInorder(root.left);
			System.out.print(root.data + " ");
			printInorder(root.right);
		}
	}

	public static void main(String args[]) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insertData(80);
		tree.insertData(30);
		tree.insertData(90);
		tree.insertData(20);
		tree.insertData(10);
		tree.insertData(40);
		tree.insertData(60);
		tree.insertData(50);
		tree.insertData(70);
		tree.insertData(100);
		
		tree.printInorder(tree.root);
	}

}
