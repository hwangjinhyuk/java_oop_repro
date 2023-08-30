package Method;

import java.util.Scanner;

public class Ex3 {
	static int ft;
	static float inches;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float ft1=InputData();
		float ft2=InputData();
		
		float resultfeet=add(ft1,ft2);
		display (resultfeet);

	}

	private static float InputData() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter Feet:");
		ft=sc.nextInt();
		System.out.print("Enter Inches:");
		inches=sc.nextFloat();
		
		if (inches >=12) {
			ft++;
			inches-=12;
		}
		//float feet= coverFeet();
		//return feet;
		return coverFeet();
		
	}
	private static float add(float ft1, float ft2) {
		// TODO Auto-generated method stub
		return ft1+ft2;
	}

	private static void display(float resultfeet) {
		// TODO Auto-generated method stub
		System.out.println("Result: "+ resultfeet+ "\'");
		
	}

	private static float coverFeet() {
		// TODO Auto-generated method stub
		return ft + (inches/12);
		
	}

}
