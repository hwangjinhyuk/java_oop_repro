package SampleProgram;

import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int h, p, b;
        System.out.println("Enter the Hypotenuse");
        h = in.nextInt();
        System.out.println("Enter the Perpendicular");
        p = in.nextInt();
        System.out.println("Enter the Base");
        b = in.nextInt();

        if (h*h==(p*p)+(b*b)){
            System.out.println("Right Angled Triangle");
        }
        else{
            System.out.println("Not a right angled Traingle");
        }

	}

}
