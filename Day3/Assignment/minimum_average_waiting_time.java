import java.util.Arrays;
import java.util.Scanner;

public class minimum_average_waiting_time {
    public static int minimum_Waiting_Time(int[] arr) {
    	//The only we can get minimum average waiting time is by picking the order which has low time
    	// If cook does not know about future orders we can use heap data structure to insert the current order in list
    	Arrays.sort(arr);
    	int sum=0;
    	for(int i=0;i<arr.length;i++) {
    		sum =sum+arr[i];
    	}
    	int avg = sum/arr.length;
    	return avg;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		// taking input waiting time for the ith person
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		
		int min = minimum_Waiting_Time(arr);
        System.out.println(min);
	}

}
