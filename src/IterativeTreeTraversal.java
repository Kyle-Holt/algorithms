import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class IterativeTreeTraversal {
	
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

		List<Integer> result = preOrderIt(root);
		System.out.println(result);
		
		List<Integer> resultIn = inOrderIt(root);
		System.out.println(resultIn);
		
		List<Integer> resultPost = postOrderIt(root);
		System.out.println(resultPost);
		//inOrder(root);
		//preOrder(root);
		//postOrder(root);
		
	}
	
	public static List<Integer> preOrderIt(BinaryTreeNode root){
		Stack stack = new Stack();
		List<Integer> result = new ArrayList<Integer>();
		
		if(root == null){
			return result;
		}
		stack.push(root);
		//result.add(root.getData());
		while(!stack.isEmpty()){
			BinaryTreeNode obj = (BinaryTreeNode) stack.pop();
			result.add(obj.getData());
			if(obj.getRight() != null){
				stack.push(obj.getRight());
			}
			if(obj.getLeft() != null){
				stack.push(obj.getLeft());
			}	
		}
		
		return result;
	}
	
	public static List<Integer> inOrderIt(BinaryTreeNode root){
		Stack stack = new Stack();
		List<Integer> result = new ArrayList<Integer>();
		
		if(root == null){
			return result;
		}
		stack.push(root);
		//result.add(root.getData());
		while(!stack.isEmpty()){
			BinaryTreeNode obj = (BinaryTreeNode) stack.peek();
			if(obj.getLeft() != null){
				stack.push(obj.getLeft());
				obj.left = null;
			}else{
				result.add(obj.getData());
				stack.pop();
				if(obj.getRight() != null){
					stack.push(obj.getRight());
				}
			}	

		}
		
		return result;
	}
	
	public static List<Integer> postOrderIt(BinaryTreeNode root){
		Stack stack = new Stack();
		List<Integer> result = new ArrayList<Integer>();
		
		if(root == null){
			return result;
		}
		stack.push(root);
		//result.add(root.getData());
		//root = null;
		while(!stack.isEmpty()){
			BinaryTreeNode obj = (BinaryTreeNode) stack.peek();
			if((obj.getLeft() == null)&&(obj.getRight() == null)){
				BinaryTreeNode obj2 = (BinaryTreeNode) stack.pop();
				result.add(obj2.getData());
			}

			if(obj.getRight() != null){
				stack.push(obj.getRight());
				obj.right = null;
			}
			if(obj.getLeft() != null){
				stack.push(obj.getLeft());
				obj.left = null;
			}
		}
		
		return result;
	}
}
