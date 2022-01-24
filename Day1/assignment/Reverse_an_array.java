import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Reverse_an_array {
	
    public static int[] reverseArray(int[] arr) {
    	/*
    	  Time Complexity -  O(N) for one traversal 
    	  Space Complexity - O(N) for additional array 
    	  Here we reverse an array using reverse traversal 
    	  We start from last index of input array and
    	  Insert element into the new result array from front  
    	 */
    	int len = arr.length;
    	int[] reversedArray = new int[len];
    	
    	for(int i=len-1;i>=0;i--) {
    		reversedArray[len-i-1]=arr[i];
    	}
    	
    	return reversedArray;
    }
    public static int[] reverseArrayUsingStack(int[] arr) {
    	/*
    	   Time Complexity - O(N)+O(N) which is Equal to O(2N) for two traversals
    	   Space Complexity - O(N) for stack
    	   We use stack to reverse an array
    	   stack is a linear data structure which follows LIFO order
    	   LIFO - Last In First Out
    	   At first we insert all the elements of an array to stack one by one
    	   And then we take out elements from stack 
    	 */
    	int len = arr.length;
    	Stack<Integer> stack = new Stack<>();
    	
    	for(int i=0;i<len;i++) {
    		stack.push(arr[i]);
    	}
    	
    	int i=0;
    	while(!stack.isEmpty()) {
    		arr[i]=stack.peek();
    		stack.pop();
    		i++;
    	}
    	
    	return arr;
    }
    public static int[] reverseArrayUsingSwap(int[] arr) {
    	/*
    	  Time Complexity - O(N/2) we are only traversing upto middle of the array by incrementing and decrementing low and high pointers
    	  Space Complexity -O(1) constant space because we are not using any external array or stack for calculation
    	  Here we use two pointers low and high
    	  low pointer starts from 0 and high pointer starts from last index
    	  we swap the elements at low and high pointers
          increment low and decrement high
          we do swapping till low becomes greater than equal to high
    	 */
    	int len = arr.length;
    	int low = 0;
    	int high = arr.length-1;
    	while(low<high) {
    		int temp=arr[low];
    		arr[low]=arr[high];
    		arr[high]=temp;
    		low++;
    		high--;
    	}
    	return arr;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int[] res1=reverseArray(arr);
		int[] res2=reverseArrayUsingStack(arr);
		int[] res3=reverseArrayUsingSwap(arr);
		System.out.println(Arrays.toString(res1));
	}

}
