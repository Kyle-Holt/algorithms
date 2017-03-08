
//Stack, FIFO implementation
public class Stacks {

	MyLinkedList stack = new MyLinkedList();
	
	//pops the most recent element from the stack, head of the linked list
	public int pop(){
		if(stack.getSize() == 0){
			System.out.println("This stack is empty");
			return -1;
		}
		
		Node n = stack.getHead();
		int d = n.getData();
		
		//this will make sure the item is removed from the stack
		stack.remove(0);
		
		return d;
	}
	
	//pushes an element to the top of a stack, now is the head of linekd list
	public void push(int d){
		stack.add(d);
	}
	
	//peeks the element from teh top of the stack, does not remove
	public int peek(){
		if(stack.getSize() == 0){
			System.out.println("This stack is empty");
			return -1;
		}
		
		Node n = stack.getHead();
		int d = n.getData();
		
		return d;
	}
	
	public int size(){
		int size = stack.getSize();
		
		return size;
	}
	
	public String toString(){
		return stack.toString();
	}
	
	
	public static void main(String[] args) {
		Stacks stack = new Stacks();
		System.out.println(stack.size());
		stack.peek();
		stack.pop();
		System.out.println(stack.size());
		System.out.println(stack.toString());
		stack.push(1);
		System.out.println(stack.toString());
		stack.push(2);
		System.out.println(stack.toString());
		stack.push(3);
		System.out.println(stack.size());
		System.out.println(stack.toString());
		stack.pop();
		System.out.println(stack.toString());
		stack.peek();
		System.out.println(stack.toString());
	}
}
