package Trees;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        printLevelOrder(tree.getRoot());
       
	}
	
	public static void printLevelOrder(Node node) {
		int height = getHeight(node);
		for (int i = 0; i <= height; i++) {
			printALevel(node, i);
		}
	}
	
	public static int getHeight(Node node) {
		if (node == null) {
			return 0;
		} else {
			int leftHeight = getHeight(node.left) + 1;
			int rightHeight = getHeight(node.left) + 1;
			
			if(leftHeight > rightHeight)
				return leftHeight;
			return rightHeight;
		}
	}
	
	public static void printALevel(Node node, int level) {
		if(node == null) {
			return;
		} 
		
		if (level == 1) {
			System.out.print(node.data + " ");
		} else if (level > 1){
			printALevel(node.left, level - 1);
			printALevel(node.right, level - 1);
		}
	}
}
