package Trees;

public class TreeTraversal {
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        System.out.println("....Printing PreOrder....");
        printPreOrder(tree.getRoot());
        System.out.println();
        System.out.println("....Printing InOrder....");
        printInOrder(tree.root);
        System.out.println();
        System.out.println("....Printing PostOrder....");
        printPostOrder(tree.root);
	}
	
	public static void printPreOrder(Node node) {
		if(node != null) {
			System.out.print(node.data + " ");
			printPreOrder(node.left);
			printPreOrder(node.right);
		}
	}
	
	public static void printInOrder(Node node) {
		if(node != null) {
			printInOrder(node.left);
			System.out.print(node.data + " ");
			printInOrder(node.right);
		}
	}
	
	public static void printPostOrder(Node node) {
		if(node != null) {
			printPostOrder(node.left);
			printPostOrder(node.right);
			System.out.print(node.data + " ");
		}
	}
	
}
