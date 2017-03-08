import java.util.ArrayList;
import java.util.List;


public class TreeNode {
	
	int data;
	String id;
	TreeNode child;
	TreeNode parent;
	List<TreeNode> children = new ArrayList<TreeNode>();

	/*
	public TreeNode(int d){
		this.data = d;
		this.child = null;
		this.parent = null;
	}
	*/
	
	public TreeNode(String id, int d, TreeNode parent){
		this.id = id;
		this.data = d;
		this.child = null;
		this.parent = parent;
	}
	/*
	public void setParent(TreeNode t){
		parent = t;
		//t.addChild(this);
	}
	*/
	
	
	public void addChild(String id, int d, TreeNode parent){
		TreeNode newChild = new TreeNode(id, d, parent);
		//newChild.setParent(this);
		parent.getChild().add(newChild);
		
		//newChild.setParent(this);
	}
	
	public void addChild(TreeNode t){
		children.add(t);
		/*
		if(t.getParent() == null){
			t.setParent(this);
		}
		*/	
	}
	
	public TreeNode getParent(){
		return parent;
	}
	
	public List<TreeNode> getChild(){
		return children;
	}
	
	public int getData(){
		return data;
	}
	
	public void setData(int d){
		data = d;
	}
	
	public boolean isLeaf(){
		if(children.isEmpty()){
			return true;
		} else {
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
	
	public String getId(){
		return id;
	}
	
	public void removeParent(){
		this.parent = null;
		
	}
	

	
	public static void main(String[] args) {
		TreeNode a = new TreeNode("a", 1, null);
		TreeNode b = new TreeNode("b", 2, a);
		TreeNode c = new TreeNode("c", 3, a);
		TreeNode d = new TreeNode("d", 4, b);
		a.addChild(b);
		a.addChild(c);
		b.addChild(d);
		System.out.println(d.isRoot());
		printString(a, " ");
	}
		public static void printString(TreeNode node, String appender){
			StringBuffer str = new StringBuffer();
			String newStr;
			System.out.println(appender + node.getId());
			//str.append("Parent: " + parent);
			//str.append("Id: " + id);
			//str.append("Data: " + data);
			//str.append(" Children:" + children);

			for (TreeNode each : node.getChild()){
				printString(each, appender + appender);
			}
			
			newStr = str.toString();
			//return newStr;
		}
	}
	
