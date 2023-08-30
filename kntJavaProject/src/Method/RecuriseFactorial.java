package Method;

import java.util.Scanner;

public class RecuriseFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		int fact= factorial (num);
		System.out.println("Factorial= "+fact);

	}

	private static int factorial(int num) {
		// TODO Auto-generated method stub
		if(num <= 1)
			return 1;
		else
			return num * factorial(num-1);
		
		
		
	}

}
