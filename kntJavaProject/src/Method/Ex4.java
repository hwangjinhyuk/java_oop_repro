package Method;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		
		multiplication (num);
	}

	private static void multiplication(int num) {
		// TODO Auto-generated method stub
		for (int i=1;i<=12; i++) {
			System.out.println(num + "*" +i + "=" + (num*i));
		}
		
	}

}
