
public class BinaryTreeNode {

	int data;
	//String id;
	BinaryTreeNode left;
	BinaryTreeNode right;
	BinaryTreeNode parent;
	
	public BinaryTreeNode(int d){
		this.data = d;
		//this.id = id;
		this.parent = null;
		this.left = null;
		this.right = null;
	}
	
	public BinaryTreeNode getLeft(){
		return left;
	}
	
	public BinaryTreeNode getRight(){
		return right;
	}
	
	public int getData() {
		return data;
	}
	
	public void addLeft(BinaryTreeNode left){
		this.left = left;
		left.parent = this;
	}
	
	public void addRight(BinaryTreeNode right){
		this.right = right;
		right.parent = this;
	}
	
	public BinaryTreeNode getParent(){
		return parent;
	}
	
	/*
	public String getId(){
		return id;
	}
	*/
	
	public boolean isLeaf(){
		if((left == null)&&(right == null)){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isRoot(){
		if(parent == null){
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		BinaryTreeNode root = new BinaryTreeNode(1);
		BinaryTreeNode left1 = new BinaryTreeNode(2);
		BinaryTreeNode right1 = new BinaryTreeNode(3);
		BinaryTreeNode leftleft2 = new BinaryTreeNode(4);
		BinaryTreeNode leftright2 = new BinaryTreeNode(5);
		root.addLeft(left1);
		root.addRight(right1);
		System.out.println(root.isLeaf());	
		System.out.println(left1.isLeaf());	
		System.out.println(right1.isLeaf());	
		
	}

	
}
