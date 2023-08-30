package Method;

public class Ex7 {

	
		// TODO Auto-generated method stub
		int a , b;
		  
		  public Ex7 (int a , int b)
		  {
		    this.a = a;
		    this.b = b;
		  }
		  public static void main(String[] args) {
		    
		    Ex7 m1= new Ex7(10,20);
		    System.out.println("Before Swapping");
		    System.out.println("m1 a =" +m1.a +"m2 b=" +m1.b);
		    
		    swap (m1);
		    
		    System.out.println("After Swapping");
		    System.out.println("m1 a =" +m1.a +"m2 b=" +m1.b);

		}
		  
		  public static void swap (Ex7 M2)
		  {
		    int temp = M2.a;
		    M2.a = M2.b;
		    M2.b = temp;
		  }

	}


