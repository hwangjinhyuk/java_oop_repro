package Method;

import java.util.Scanner;

public class RecuriseEx {
	static Scanner sc=new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter first number: ");
		int a= sc.nextInt();
		System.out.print("Enter second number: ");
		int b= sc.nextInt();
		
		sum(a,b);

	}

	private static void sum(int a, int b) {
		// TODO Auto-generated method stub
		int c = a+b;
		System.out.println("C= "+c);
		if (c<=100) {
			System.out.print("Enter another first number: ");
			int n1=sc.nextInt();
			System.out.print("Enter another second number: ");
			int n2=sc.nextInt();
			sum(n1,n2);
		}
		
	}

}
