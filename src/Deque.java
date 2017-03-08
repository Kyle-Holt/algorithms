
//implements the general Queue that can add to front and remove from tail, as well as peek
public class Deque extends Queue {

	public int peekLast(){
		if(size() == 0){
			System.out.println("The deque is empty");
			return -1;
		}
		Node n = queue.getTail();
		int d = n.getData();
		
		return d;
	}
	
	public void enqueueFront(int d){
		queue.add(d);
	}
	
	public int dequeueLast(){
		if(size() == 0){
			System.out.println("The deque is empty");
			return -1;
		}
		Node n = queue.getTail();
		int d = n.getData();
		
		queue.remove(queue.getSize()-1);
		
		return d;
	}
	
	public static void main(String[] args) {
		Deque deque = new Deque();
		deque.size();
		deque.peek();
		deque.dequeue();
		System.out.println(deque.size());
		deque.enqueue(1);
		deque.enqueue(2);
		deque.enqueue(3);
		System.out.println(deque.size());
		System.out.println(deque.toString());
		deque.dequeue();
		System.out.println(deque.toString());
		deque.enqueueFront(1);
		deque.dequeueLast();
		System.out.println(deque.toString());
		
	}
}
