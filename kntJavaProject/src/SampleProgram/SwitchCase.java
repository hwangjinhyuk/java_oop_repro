package SampleProgram;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String proceed;
		do {
		Scanner sc=new Scanner(System.in);
		int result=0;
		System.out.println("Enter '+' or '-' or '*' or '/'");
		String con=sc.nextLine();
		System.out.println("Enter First Value");
		int a=sc.nextInt();
		System.out.println("Enter Second Value");
		int b=sc.nextInt();
		
		switch(con) {
        case "+": result = a + b;
        break;
        case "-": result = a - b;
        break;
        case "*": result = a * b;
        break;
        case "/": result = a / b;
        break;
        default:
            System.out.println("Invalid operator");
    }
		System.out.println("Result: " + result);
		System.out.println("Do you want to continue? Enter 'yes' to continue");
        proceed = sc.next();
    } while (proceed.equals("yes"));
}

}
