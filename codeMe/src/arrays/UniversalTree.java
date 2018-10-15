package arrays;

public class UniversalTree {
	static Node root=null;

	public static void main(String[] args) {
		UniversalTree obj= new UniversalTree();
		obj.root = new Node(1);
		
		obj.root.left = new Node(1);
		obj.root.right = new Node(1);
		
		obj.root.left.left = new Node(1);
		obj.root.left.right = new Node(1);
		
		obj.root.right.left = new Node(1);
		obj.root.right.right = new Node(1);
		
		obj.root.right.left.left = new Node(2);
		obj.root.right.right.right = new Node(1);
		int c= obj.findUniversal(root);
		System.out.println(c);
	}
	int count=0;
	int prevNode=0;
	public int findUniversal(Node root){
	
			if(root == null) {
				return 0 ;
			}
			if(root.left != null && root.right != null && root.right.data == root.data && root.left.data == root.data ) {
				count++;
				prevNode = root.data;
				findUniversal(root.left);
			}
			
				findUniversal(root.right);
			
				if(root.left == null && root.data == prevNode ) {
					count++;
			
				}
				if(root.right == null && root.data == prevNode ) {
					count++;
				
				}
			
		
			
			return count;
		}
	
}

class Node{
	int data;
	Node left, right,root;
	
	Node(int data){
		this.data = data;
		left= right = null;
	}
}
