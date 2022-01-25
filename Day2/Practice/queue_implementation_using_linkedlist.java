package queue;

class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
	}
}

class LQueue{
	static int size;
	static int cap;
	static Node front;
	static Node rear;
	LQueue(int c){
		cap=c;
		size=0;
		front=null;
		rear=null;
	}
	
	public static boolean isfull() {
		return size==cap;
	}
	
	public static boolean isEmpty() {
		return  size==0;
	}
	
	public static int size() {
		return size;
	}
	
	public static int getFront() {
		return front.data;
	}
	public static int getRear() {
		return rear.data;
	}
	
	public void enqueue(int d) {
		if(isfull()) return;
		Node temp=new Node(d);
		size++;
		if(front==null) {
			front=temp;
			rear=temp;
			return ;
		}
		rear.next=temp;
		rear=rear.next;
		return;
	}
	
	public static void dequeue() {
		if(isEmpty()) return ;
		front=front.next;
        if(front==null) rear=null;
		size--;
		return ;
	}
}

public class queue_implementation_using_linkedlist {

	public static void main(String[] args) {
		LQueue q=new LQueue(5);
		q.enqueue(1);		
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		System.out.println(q.getFront());
		System.out.println(q.isfull());
		q.dequeue();
		System.out.println(q.isfull());
		System.out.println(q.getFront());
		System.out.println(q.getRear());
	}

}
