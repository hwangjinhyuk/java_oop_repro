package Method;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter length: ");
		int length=sc.nextInt();
		System.out.println("Enter width: ");
		int width=sc.nextInt();
		
		System.out.println("Aera= "+aera (length,width));
		System.out.println("Perimeter = "+ Perimeter(length,width));

	}

	private static int Perimeter(int l, int w) {
		// TODO Auto-generated method stub
		return (1 * w);
	}

	private static int aera(int l, int w) {
		// TODO Auto-generated method stub
		return (2*(l+w));
	}

}
