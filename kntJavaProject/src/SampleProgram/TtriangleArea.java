package SampleProgram;

import java.util.Scanner;

public class TtriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base of the triangle: ");
        int base = scanner.nextInt();

        System.out.println("Enter the height of the triangle: ");
        int height = scanner.nextInt();

        int area = (base * height) /2;

        System.out.printf("The area of the triangle " + area);
    

	}

}
