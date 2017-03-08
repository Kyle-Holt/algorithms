
public class MyLinkedList {
	
	Node head;
	
	//automatically adds to the head of the linked list
	public void add(int d){
		if(head == null){
			head = new Node(d);
		} else{
			Node temp = head;
			head = new Node(d);
			head.setNext(temp);
		}
	}
	
	//adds to the tail of the linked list
	public void addTail(int d){
		//case where head is null
		if(head == null){
			head = new Node(d);
		} else{
			Node temp = new Node(d);
			Node n = head;

			while(n.getNext() != null) {
				n = n.getNext();
			}
			n.setNext(temp);
		}
		
	}

	//removes a node in the kth position or returns that it is unable to do so
	public Node remove(int k){
		//case removing head
		if(k == 0) {
			if(head == null){
				System.out.println("The head is null");
				return null;
			}
			head = head.getNext();
			return head;
		}
		//case where k is out of bounds
		if(k > getSize()){
			System.out.println("Out of range");
			return null;
		}
		
		//links past the previous node
		Node prev = getKth(k-1);
		Node n = getKth(k);
		
		prev.setNext(n.getNext());
		
		return n;	
	}
	
	//returns the kth node, if it exists
	public Node getKth(int k){
		
		Node n = getHead();
		int counter = 0;
		
		while(n.getNext() != null) {
			n = n.getNext();
			counter++;
			if(counter == k){
				break;
			}
			
		}
		if(k > getSize()) {
			System.out.println("Request out of range, returning tail:");
		}
		return n;
	}
	
	public Node getHead(){
		return head;
	}
	
	public Node getTail(){
		Node n = getHead();
		
		while(n.getNext() != null) {
			n = n.getNext();
		}
		return n;
	}
	
	public int getSize(){
		Node n = getHead();
		int size = 1;
		if(n == null){
			return 0;
		}
		while(n.getNext() != null){
			size++;
			n = n.getNext();
		}
		return size;
	}
	
	//converts the linked list to a more readable string
	public String toString(){
		Node n = getHead();
		StringBuffer str = new StringBuffer();
		String newStr;
		for(int i = 0; i < getSize(); i++){
			str.append(n.getData() + " ");
			n = n.getNext();
		}
		newStr = str.toString();
		return newStr;
	}
	
	public static void main(String[] args) {
		MyLinkedList testList = new MyLinkedList();
		testList.remove(4);
		testList.add(0);
		testList.add(1);
		testList.addTail(2);
		testList.add(4);
		testList.addTail(3);
		System.out.println(Integer.toString(testList.getSize()));
		System.out.println(testList.getHead());
		System.out.println(testList.getKth(1));
		System.out.println(testList.getKth(2));
		System.out.println(testList.getKth(3));	
		System.out.println(testList.getTail());
		testList.remove(4);
		System.out.println(testList.toString());
		System.out.println(testList.getKth(6));	
	}

}
