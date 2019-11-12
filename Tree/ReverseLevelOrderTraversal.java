class Node 
	{ 
		int data; 
		Node left;
		Node right; 
	
		Node(int d) 
		{ 
			data = d; 
			left = right; 
		} 
	} 
class BinaryTree 
{ 
	Node root; 
	void reverseLevelOrder(Node node) 
	{ 
		int h = height(node); 
		int i; 
		for (i = h; i >= 1; i--) 
		{ 
			printLevel(node, i); 
		} 
	} 
	void printLevel(Node node, int level) 
	{ 
		if (node == null) 
			return; 
		if (level == 1) 
			System.out.print(node.data + " "); 
		else if (level > 1) 
		{ 
			printLevel(node.left, level - 1); 
			printLevel(node.right, level - 1); 
		} 
	} 
	int height(Node node) 
	{ 
		if (node == null) 
			return 0; 
		else
		{ 
			int lh = height(node.left); 
			int rh = height(node.right); 
			if (lh > rh) 
				return (lh + 1); 
			else
				return (rh + 1); 
		} 
	}
	
}
class ReverseLevelOrderTraversal{
	public static void main(String args[]) 
	{ 
		BinaryTree t1 = new BinaryTree(); 
		t1.root = new Node(1); 
		t1.root.left = new Node(2); 
		t1.root.right = new Node(3); 
		t1.root.left.left = new Node(4);
		t1.root.right.left = new Node(6); 
		t1.root.left.right = new Node(5); 
		t1.root.right.right = new Node(7);
		System.out.println("Reverse Level Order traversal of binary t1 is : "); 
		t1.reverseLevelOrder(t1.root); 
	} 
}