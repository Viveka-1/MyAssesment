package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 8 ;
		int firstterm =0;
		int secondterm =1;
		System.out.println("Fibonacci Series till " + n + " terms:");

		
		System.out.println(firstterm + "\n "+ secondterm);

		
		for (int i = 0; i < 6; i++) {
	
			int nextterm  = firstterm+secondterm;//0+1
			System.out.println(nextterm);
			firstterm=secondterm;//assigning first as second
			secondterm=nextterm;//assigning second as next
			
}

	
	
	
	
	}

}
