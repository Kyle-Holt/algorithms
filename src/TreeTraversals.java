
public class TreeTraversals {
	
	public static void main(String[] args) {
		BinaryTreeNode root = new BinaryTreeNode(1);
		BinaryTreeNode left1 = new BinaryTreeNode(2);
		BinaryTreeNode right1 = new BinaryTreeNode(3);
		BinaryTreeNode leftleft2 = new BinaryTreeNode(4);
		BinaryTreeNode leftright2 = new BinaryTreeNode(5);
		root.addLeft(left1);
		root.addRight(right1);
		left1.addLeft(leftleft2);
		left1.addRight(leftright2);

		//inOrder(root);
		//preOrder(root);
		postOrder(root);
		
	}
	
	public static void inOrder(BinaryTreeNode root){
		if(root.getLeft() != null){
			inOrder(root.getLeft());
		}
		
		System.out.println(root.getData());
		
		if(root.getRight() != null){
			inOrder(root.getRight());
		}		
	}
	
	public static void preOrder(BinaryTreeNode root){
		System.out.println(root.getData());
		
		if(root.getLeft() != null){
			preOrder(root.getLeft());
		}
		
		if(root.getRight() != null){
			preOrder(root.getRight());
		}		
	}
	
	public static void postOrder(BinaryTreeNode root){
		if(root.getLeft() != null){
			postOrder(root.getLeft());
		}
		
		if(root.getRight() != null){
			postOrder(root.getRight());
		}	
		
		System.out.println(root.getData());
	}
}
