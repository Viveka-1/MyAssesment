package week2.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		
		for (int i = 0; i < arr.length; i++) {
			
			Arrays.sort(arr);
			
			int b= i+1;
			
			
			if (b!=arr[i]) {
				break;
				
			}

			System.out.println(b);
		}

	}

}
