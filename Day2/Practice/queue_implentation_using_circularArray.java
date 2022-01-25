package queue;

class queue{
	int cap;
	int size;
	int front;
	int[] arr;
	queue(int c){
		cap=c;
		size=0;
		front=0;
		arr=new int[cap];
	}
	boolean isEmpty() {
		return  size==0;
	}
	boolean isfull() {
		return cap==size;
	}
	void enqueue(int d) {
		if(isfull())return ;
		int rear=getRear();
		rear=(rear+1)%cap;
		arr[rear]=d;
		size++;
	}
	void dequeue() {
		if(isEmpty()) return ;
		front =(front+1)%cap;
		size--;
	}
	int getRear() {
		if(isEmpty()) return -1;
		return (front+size-1)%cap;
	}
	int getFront() {
		if(isEmpty()) return -1;
		return front;
	}
	
}

public class queue_implentation_using_circularArray {

	public static void main(String[] args) {
		queue q=new queue(5);
		q.enqueue(1);		
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		System.out.println(q.arr[q.getFront()]);
		System.out.println(q.isfull());
		q.dequeue();
		System.out.println(q.isfull());
		System.out.println(q.arr[q.getFront()]);

	}

}
