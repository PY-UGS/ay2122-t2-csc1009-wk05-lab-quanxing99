
public class aRectangle extends Shape 
{
	// Constructor with parent properties
			public aRectangle(double dim1, double dim2) 
			{
				super(dim1, dim2);
			}

			public double getArea() {
				
				return super.getDim1() * super.getDim2();
			}

}
