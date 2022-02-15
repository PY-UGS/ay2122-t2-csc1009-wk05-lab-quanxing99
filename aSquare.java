
public class aSquare extends Shape  {
	// Constructor with parent properties
				public aSquare(double dim1, double dim2) 
				{
					super(dim1, dim2);
				}

				public double getArea() {
					
					return super.getDim1() * super.getDim2();
				}

}
