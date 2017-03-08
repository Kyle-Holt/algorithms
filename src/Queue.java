
//LIFO implementation, queue using linked list
public class Queue {

	MyLinkedList queue = new MyLinkedList();
	
	public int peek(){
		if(size() == 0){
			System.out.println("The queue is empty");
			return -1;
		}
		Node n = queue.getHead();
		int d = n.getData();
		
		return d;
	}
	
	public void enqueue(int d){
		queue.addTail(d);
	}
	
	public int dequeue(){
		if(size() == 0){
			System.out.println("The queue is empty");
			return -1;
		}
		Node n = queue.getHead();
		int d = n.getData();
		
		queue.remove(0);
		
		return d;
	}
	
	public int size(){
		int size = queue.getSize();
		
		return size;
	}
	
	public String toString(){
		return queue.toString();
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.size();
		queue.peek();
		queue.dequeue();
		System.out.println(queue.size());
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		System.out.println(queue.size());
		System.out.println(queue.toString());
		queue.dequeue();
		System.out.println(queue.toString());
	}
}
