package Array;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"Su Su","Aung Aung","Zin Zin","Min Min","Khin Thu"};
		int [] marks = {48,90,95,88,100};
		
		for (int i=0; i< name.length; i++) {
			if (marks[i]>=50) {
				System.out.println(name[i]+ ":pass");
			}
			else 
				System.out.println(name[i]+ ":fail");
		}

	}

}
