package SampleProgram;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the length of the rectangle: ");
	        int length = scanner.nextInt();

	        System.out.println("Enter the width of the rectangle: ");
	        int width = scanner.nextInt();
	        int area = length * width;

	        System.out.printf("Area of Rrectangle = "+area);

	}

}
