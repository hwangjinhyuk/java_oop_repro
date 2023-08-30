package Method;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {9,5,2,4};
		int [] B= {7,3,1,9};
		int [] C= Add(A,B);
		display (C);

	}
	private static int[] Add(int[] A, int[] B) {
		// TODO Auto-generated method stub
		int [] C =new int [A.length];
		for (int i=0;i<A.length; i++); {
		int i = 0;
		C[i] = A[i]+B[i]; }
		
	return C; }

	private static void display(int[] C) {
		// TODO Auto-generated method stub
		for (int i=0; i< C.length; i++) {
			System.out.print(C[i]+ " ");
		}
		
	}
	
	

}
