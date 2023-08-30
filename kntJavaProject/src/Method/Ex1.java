package Method;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter First Number: ");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number:");
		int num2=sc.nextInt();
		
		max(num1 , num2); //actual parameter   pass by value
		System.out.println("End Program");
	}
	public static void max(int n1,int n2) {  //formal  parameter
		if (n1> n2)
			System.out.println("Maximum value= "+n1);
		else 
			System.out.println("Maxumum value= "+n2);
		
	}

}
