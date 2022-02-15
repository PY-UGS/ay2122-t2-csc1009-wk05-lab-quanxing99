import java.lang.Math;

public class Circle extends GeometricObject 
{
	private double radius;
	
	private final static double PI = 3.14159; 

	public Circle(){}

	public Circle(double radius) 
	{
		this.radius = radius;
	}
	
	// Constructor with parent properties
	public Circle(Double radius, String colour, Boolean filled) 
	{
		super(colour, filled);
		this.radius = radius;
	}
	

	public double getRadius() 
	{
		return radius;
	}

	public void setRadius(double radius) 
	{
		this.radius = radius;
	}
	
	public double getArea() {
		
		return PI * Math.pow(this.radius, 2);
	}
	
	public double getPerimeter() {
		
		return 2 * PI * this.radius;
	}
	
	public double getDiameter() {
		
		return 2 *  this.radius;
	}
	
	public void printCircle() {
		System.out.println("A cirlce with radius: " + this.radius);
	}

}
