package SampleProgram;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
	    final double PIE = 3.14;
	    System.out.print("Enter Radius");
	    int radius = sc.nextInt();
	    double area = PIE * radius * radius ;
	    System.out.println("Area of Circle = "+area);

	}

}
