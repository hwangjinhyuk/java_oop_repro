package SampleProgram;

import java.util.Scanner;

public class TypeConvention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc= new Scanner (System.in);
	
	for (int i=0; i<=3; i++) {
	System.out.println("Enter Username");
	String username = sc.nextLine();
	System.out.println("Enter Password");
	String password = sc.nextLine();
	
		if (username.equals("Maung Maung") && password.equals("123")) {
			System.out.println("Correct User");
	}
		else {
			System.out.println("Wrong User");
		}

	}
	}
}


