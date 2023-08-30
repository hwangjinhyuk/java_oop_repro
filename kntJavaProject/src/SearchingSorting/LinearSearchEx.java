package SearchingSorting;

import java.util.Scanner;

public class LinearSearchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("The number of element: ");
		int n=sc.nextInt();
		
		int [] A = new int[n];
		for (int i=0; i<A.length; i++) {
			System.out.print("Enter a value: ");
			A [i] =sc.nextInt();
		}
		System.out.println("Enter search key: ");
		int key = sc.nextInt();
		
		linearSearch(A,key);

	}

	private static void linearSearch(int[] A, int key) {
		// TODO Auto-generated method stub
		int i;
		for ( i=0; i<A.length; i++) {
			if (key == A[i]) {
				System.out.println(key+" is found at index "+i);
				break;
				
			}
		}
		if (i==A.length) 
			System.out.println(key + "is not found");
	}

}
