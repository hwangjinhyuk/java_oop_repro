package Method;

public class MethodOverloadEx2 {

	
		// TODO Auto-generated method stub
		  public static void repChar( ) {
		    for( int i=1; i<=45; i++ )
		    System.out.print("* ");
		    System.out.println();
		    }
		    public static void repChar(char ch) {
		    for( int i=1; i<=45; i++ )
		    System.out.print(ch);
		    System.out.println();
		    }
		    public static void repChar(char ch, int n) {
		    for( int i=1; i<=n;i++ )
		    System.out.print(ch);
		    System.out.println();
		    }

		  public static void main(String[] args) {
		    
		    repChar( );
		    repChar('=');
		    repChar('+',30 );
		    
		    

		  

	}

}
