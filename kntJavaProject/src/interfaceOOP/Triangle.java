package interfaceOOP;

public class Triangle implements InterfaceOOP { 

	private double a;
	  private double b;
	  private double c;
	  
	  public Triangle(double a, double b, double c) {
	    this.a = a;
	    this.b = b;
	    this.c = c;
	    }
	  
	  public double area() {
	    double s = (a + b + c) / 2.0;
	    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	  }
	  
	  public double perimeter() {
	    return a + b + c;
	    }
	  
	  public static void main(String[] args) {
	    
	    Rectangle r = new Rectangle(2.0, 3.0);
	    System.out.println("Rectangle - Area: " + r.area());
	    System.out.println("Rectangle - perimeter: " + r.perimeter());
	    
	    Circle c = new Circle(12.0);
	    System.out.println("Circle - Area: " + c.area());
	    System.out.println("Circle - perimeter: " + c.perimeter());
	    
	    Triangle tri = new Triangle(7, 12, 13);
	    System.out.println("Triangel - Area: " + tri.area());
	    System.out.println("Triange - perimeter: " + tri.perimeter());
	    
	  }
}
