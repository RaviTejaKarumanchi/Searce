
public class LinkedList_Traverse {
	
	/*
	 Linked List Node 
	 */
    static class Node{
    	int data; // It holds the value of Linked list Node
    	Node next; // It hold the address of next Node 
    	Node(int val) {
    		this.data = val;
    		this.next =null;
    	}
    }
	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth =  new Node(4);
		
		// result after execution of above code 
		// 2 4 3 1
		
		/*
		 After line 19 all the Nodes with values 1,2,3,4 are created by initializing next pointer to null
		 Now we need to connect each node to its next node
		 */
		
		head.next = second ;
		second.next= third;
		third.next = fourth;
		
		//result after execution of above code from 28 to 30    
		//1->2->3->4
		
		// Time Complexity - O(N)
		// Space Complexity - O(1)
	    Node cur = head; //cur is pointing to head;
	    while(cur!=null) {
	    	System.out.println(cur.data);
	    	cur=cur.next;
	    }
	}

}
