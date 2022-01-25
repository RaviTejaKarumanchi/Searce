package queue;

public class first_circular_tour {

	public static int check(int[] petrol,int[] dist) {
		int total=0;
		int res=0;
		int i=0;
		int count=0;
		first:
		for(int j=0;j<petrol.length;j++) {
		while(true) {
			count++;
			if(count==petrol.length+1) return res;
			total+=petrol[i];
			if(total>=dist[i]) {
				total-=dist[i];
				i=(i+1)%petrol.length;
			}
			else {
				count=0;
				res=(i+1)%petrol.length;
				i=(i+1)%petrol.length;
				total=0;
				continue first;
			}
		}
	}
	return  -1;
}
	
	public static void main(String[] args) {
		 int[] petrol= {8,9,4};
		 int[] dist= {5,10,12};
		 int res=check(petrol,dist);
		 System.out.println(res);
	}

}
