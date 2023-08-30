package Method;

import java.util.Scanner;

public class MethodArrayEx {
	static Scanner sc=new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = new int [5];
		input (A,A.length);
		display(A);
		
		
		int index = maxValue (A,A.length);
		System.out.print("\nLarger element is " + A[index]+ "at index "+ index);

	}

	public static int maxValue(int[] a, int n) {
		// TODO Auto-generated method stub
		//Arrays.sort(a);
		//return a.length;
		int max= a[0];
		int index=0;
		for (int i=1; i<n; i++) {
			if (a[i]> max) {
				max= a[i];
			index = i; }
		}
		return index;
		
	}

	public static void display(int[] a) {
		// TODO Auto-generated method stub
		for (int i:a) {
			System.out.print(i+" ");
		}
		
	}

	public static void input(int[] a, int n) {
		// TODO Auto-generated method stub
		for (int i=0; i<n; i++) {
			System.out.println("Enter Values: ");
			a[i]=sc.nextInt();
			
		}
		
	}

}
