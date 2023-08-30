package JavaOOP;

import java.util.Scanner;

public class Student1 {
	
	/*public Student1 (String name) {
		System.out.println("Name is "+name);
	}
	public Student11 (String Age) {
		
	}
	System.out.println("Age is " Age);
		public static void main (String[] args) {
			
		}*/
	
	
public Student1 () {
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter Name: ");
	String name=sc.next();
	System.out.println("Enter Age: ");
	int age=sc.nextInt();
	System.out.println("Name: " + name + ", Age: " + age);
	

	
}
public static void main(String[] args) {
	Student1 st= new Student1();
}
}





