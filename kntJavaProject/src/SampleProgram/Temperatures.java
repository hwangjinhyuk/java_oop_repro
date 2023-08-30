package SampleProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Temperatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tem = new Scanner(System.in);
	      
	      System.out.println("How many days' temperatures? ");
	      int days = tem.nextInt();
	      
	      int [] temps = new int [days];
	      int sum = 0;
	      
	      for (int i = 0; i < days; i++)
	      {
	        System.out.println("Day "+ (i + 1) + " is high temp: ");
	        temps[i] = tem.nextInt();
	        sum += temps[i];
	      }
	      double average = (double) sum / days;
	      int count = 0;
	      for (int i =0; i < days; i++)
	      {
	        if (temps[i] > average)
	        {
	          count++;
	        }
	      }
	      System.out.printf("Average temp = %.1f\n", average);
	      System.out.println(count + "days above average");
	   
	      System.out.println("Temperatures:" +Arrays.toString(temps));
	      Arrays.sort(temps);
	      System.out.println("Two coldest days:" +temps[0] +" ," +temps[1]);
	      System.out.println("Two Hottest Days:" +temps[temps.length-1]+", " +temps [temps.length - 2]);
	    }

	}


