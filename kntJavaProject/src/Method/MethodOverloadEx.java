package Method;

public class MethodOverloadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 30;
		System.out.println("Sum = "+ (a+b));

	}
	public static int Sum(int a) {
		int b=a+12;
		return b;
	}
	public static void Sum(int a, int b) {
		System.out.println("Sum = "+ (a+b));
	}
	public static void Sum(float a, float b) {
		System.out.println("Sum = "+ (a+b));
	}
	public static int Sum(int a, int b, float c) {
		return (int) (a+b+c);
	}
	
	public static float Sum(float a, int b, float c) {
		return (a+b+c);
	
	/*public static void main(String[] args) {
		int i=2;
		float f=i;   //implict type cast  //2.0
		float g = (float) i;
		float tt = 3.45f;
		int c= (int) tt; 	//explict type cast
	}*/
	Sum ();
    System.out.println("Sum" +Sum(2));
    Sum(3,4);
    Sum(4.5f, 6.7f);
    System.out.println("Sum" +Sum(2,3,6.7f));
    System.out.println("Sum" +Sum(2.3f,6, 3.4f));
	}
}
