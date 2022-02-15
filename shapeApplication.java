
public class shapeApplication {

	public static void main(String[] args) 
	{
		aRectangle r = new aRectangle(9,5);
		aTriangle t =  new aTriangle(10,8);
		aCircle c = new aCircle(5.0,5.0);
		aEllipse e = new aEllipse(7.0,7.0);
		aSquare s = new aSquare(6.0,6.0);

		Shape figref;
		figref = r; 
		System.out.println("Inside Area for Rectangle.");
		System.out.println(String.format("Area is %.1f ", figref.getArea()));
		figref = t; 
		System.out.println("Inside Area for Triangle.");
		System.out.println(String.format("Area is %.1f ", figref.getArea()));
		figref = c; 
		System.out.println("Inside Area for Cirlce.");
		System.out.println(String.format("Area is %.1f ", figref.getArea()));
		figref = e; 
		System.out.println("Inside Area for Ellipse.");
		System.out.println(String.format("Area is %.1f ", figref.getArea()));
		figref = s; 
		System.out.println("Inside Area for Square.");
		System.out.println(String.format("Area is %.1f ", figref.getArea()));

		
	}

}
