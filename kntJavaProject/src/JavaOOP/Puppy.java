package JavaOOP;

public class Puppy {
	private int puppyAge;
	public Puppy (String name) {
		System.out.println("Name chossen is: "+name);
	}
	
	public void setAge(int age) {
		puppyAge=age;
	}
	
	public int getAge() {
		return puppyAge;

		
		

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Puppy myPuppy = new Puppy( "tommy" );

		myPuppy.setAge(2);

		System.out.println("Puppy's age is :" + myPuppy.getAge());

		}

}
