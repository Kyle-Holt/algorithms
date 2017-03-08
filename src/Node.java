
public class Node {
	int data;
	Node next;
	//for doubly linked lists
	Node prev;
	
	//constructor
	public Node(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
	
	//get, set methods
	public int getData(){
		return data;
	}
	
	public void setData(int d){
		data = d;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setNext(Node n){
		next = n;
	}
	
	public Node getPrev() {
		return prev;
	}
	
	public void setPrev(Node n) {
		prev = n;
	}
	
	public String toString(){
		return "Node with data: " + getData();
	}
}
