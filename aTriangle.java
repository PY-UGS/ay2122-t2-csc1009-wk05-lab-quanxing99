
public class aTriangle extends Shape  {
	
	// Constructor with parent properties
				public aTriangle(double dim1, double dim2) 
				{
					super(dim1, dim2);
				}

				public double getArea() {
					
					return 0.5 * super.getDim1() * super.getDim2();
				}


}
