package JavaOOP;

public class Animal {
	private String name;
	private int height;
	private String gender;
	
	public String getGender (String something) {
		this.gender = something;
		return this.gender;
	}
	
	public void getAnimal () {
		name = "GuGu";
		height = 4;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog=new Animal ();
		System.out.println(dog.name);
		dog.getAnimal();				//assign values by invoking method
		System.out.println(dog.name);	//GuGu
		System.out.println(dog.height); //4
		System.out.println(dog.gender); //null (as no value is assigned)
		System.out.println(dog.getGender("male"));
		//invoke type method return value
		

	}

}
