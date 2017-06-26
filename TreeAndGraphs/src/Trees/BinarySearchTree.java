package Trees;

public class BinarySearchTree {

	//Node class
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

	//wrapper for addNode method
	public void insertData(int data) {
		root = addNode(root, data);
	}

	//Insert new node in a binary tree
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
	
	void removeFromTree(BinarySearchTree tree, int key) {
		root = removeNode(tree.root, key);
	}
	
	public Node removeNode(Node root, int key) {
		if (root == null) {
			return root;
		}
		
		if (key < root.data) {
			root.left = removeNode(root.left, key);
		} else if (key > root.data) {
			root.right = removeNode(root.right, key);
		} 
		else {
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}
			root.data = minData(root.right);
			root.right = removeNode(root.right, root.data);
		}
		return root;
	}
	
	int minData(Node root) {
		int min = root.data;
		while (root.left != null) {
			min = root.left.data;
			root = root.left;
		}
		return min;
	}
	
	
	//print data in the tree inOrder
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
		
		tree.removeFromTree(tree, 30);
		System.out.println("");
		tree.printInorder(tree.root);
	}

}
