package Method;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a character: ");
		char ch=sc.next().charAt(0);
		System.out.println("Enter the number of column:");
		int col=sc.nextInt();
		System.out.println("Enter the number of line");
		int line=sc.nextInt();
		
		display (ch,col,line);

	}
	public static void display(char ch, int col, int line)
	  {
	    for (int i =1; i<=line; i++)
	    {
	      for (int j =1; j<=col; j++)
	      {
	        System.out.print(ch +" ");
	      }
	      System.out.println();
	    }

	  }
}
