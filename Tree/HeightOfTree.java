 class Node 
{ 
	int data; 
	Node left, right; 

	Node(int d) 
	{ 
		data = d; 
		left = right = null; 
	} 
} 

class BinaryTree 
{ 
	Node root; 
	int maxDist(Node node) 
	{ 
		if (node == null) 
			return 0; 
		else
		{
			int left1 = maxDist(node.left); 
			int right1 = maxDist(node.right); 
			if (left1 > right1) 
				return (left1 + 1); 
			else
				return (right1 + 1); 
		} 
	} 
}
class HeightOfTree{
	public static void main(String[] args) 
	{ 
		BinaryTree tree = new BinaryTree(); 

		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 

		System.out.println("Height of tree is : " + tree.maxDist(tree.root)); 
	} 
} 

