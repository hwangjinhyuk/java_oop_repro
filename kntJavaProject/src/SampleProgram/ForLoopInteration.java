package SampleProgram;

public class ForLoopInteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for (int i=1; i<=5; i++ ) {
			for (int j=1; j<=10; j++ ) {
			System.out.print("*");
			}
			System.out.println();
		}*/
		/*for (int i=1; i<=5; i++ ) {
			for (int j=1; j<=i; j++ ) {
			System.out.print("*");
			}
			System.out.println();
		}*/
		
		/*for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
		
		/*int x=1;
		while (x<=10) {
			System.out.println(x);
			x++;
		}*/
		
		for(int i=1;i<=10;i++) {
			for(int j=10;j>=i;j--) {
			System.out.print(" ");	
			}
				for (int j=1;j<=i;j++) {		  	
					System.out.print("*");	
					}
				System.out.println();	
				}
		System.out.println("__________________");
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
			  System.out.print(" ");	
			  }
			for (int j=10;j>=i;j--) {			 		
				System.out.print("*");	
				}
			System.out.println();	
			}

	}

}
