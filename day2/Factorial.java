package week1.day2;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 5, factorial = 5;
		for (int i = 4; i >= 1; i--) {
			factorial=factorial* i;
		}
		System.out.println("factorial number of" + input + "is:" + factorial);
	}
}


