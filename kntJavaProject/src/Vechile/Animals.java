package Vechile;

public class Animals {
	String color= "white";
	Animals () {
		System.out.println("animal is created");
		
	}
		public void display () {
			System.out.println("display method of Animal class");
		}
	}

class Dog extends Animals{
	  String color="black";
	  Dog(){
	  super();
	  System.out.println("dog is created");
	  }
	  public void display() {
	  System.out.println("display method of Dog class " );
	  }
	  
	  void printColor(){
	    
	    System.out.println(color);
	    System.out.println(super.color);
	    display();
	    
	    super.display (); }
	  
	  }
	  class TestSuper{
	  public static void main(String args[]){
	  Dog d=new Dog();
	  d.printColor();
	  }
	  }


