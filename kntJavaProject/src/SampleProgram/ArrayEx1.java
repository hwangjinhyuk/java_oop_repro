package SampleProgram;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int row , col;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number of rows: ");
		row=sc.nextInt();
		System.out.println("Enter the number of columns: ");
		col=sc.nextInt();
		int A[][]=new int [row][col];
		for (int i=0; i<row; i++); {
			for (int j=0; j<col; j++) {
				Scanner sc=new Scanner (System.in);
				A[i][j]=sc.nextInt(); 
				
				
				}
			}
				*/
		
		Scanner sc = new Scanner (System.in);
	    System.out.println("Enter the number of row:");
	    int row = sc.nextInt();
	    System.out.println("Enter the number of column");
	    int col = sc.nextInt();
	    
	    int[][]  A = new int [row][col];
	    
	    for (int i = 0; i<row; i++)
	    {
	      for (int j = 0; j<col ; j++)
	      {
	        System.out.print("Enter a value:");
	        A[i][j] = sc.nextInt();
	      }
	    }
	    
	    System.out.println("Display data array:");
	    for (int i = 0; i<A.length; i++)
	    {
	      for (int j =0; j<A[i].length; j++)  // A.length = no. of rows
	        System.out.print(A [i][j]+"");  // A[i].length = the number
	      System.out.println();
	    }
				
	}

}
