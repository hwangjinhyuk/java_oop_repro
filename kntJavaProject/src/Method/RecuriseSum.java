package Method;

import java.util.Scanner;

public class RecuriseSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
	    System.out.print("Enter sum number:");
	    int num = sc.nextInt();
	    
	    System.out.println("Total ="+Sum(num));
	    Sum (num);

	  }
	  
	  public static int Sum (int n)
	  {
	    if (n==1)
	      return 1;
	    else 
	      return n + Sum(n-1);
	  }

	}


