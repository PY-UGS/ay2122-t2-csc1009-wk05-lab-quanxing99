
public class aEllipse extends Shape {
	
	// Constructor with parent properties
	public aEllipse(double dim1, double dim2) 
	{
		super(dim1, dim2);
	}

	public double getArea() {
		
		return super.getPI() * super.getDim1() * super.getDim2();
	}

}
