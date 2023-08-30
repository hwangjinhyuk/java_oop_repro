package Method;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		System.out.println("Enter two number: ");
		int b = sc.nextInt();
		
		System.out.println("Before swapping ");
		System.out.println("A= "+ a+ "B= "+b);
		
		swap(a,b);
		
		System.out.println("After swapping ");
		System.out.println("A= "+ a+ "B= "+b);

	}

	private static void swap(int c, int d) {
		// TODO Auto-generated method stub
		int temp = c;
		c=d;
		d=temp;
		System.out.println("After swapping ");
		System.out.println("C= "+ c+ "D= "+d);
		
	}

}
