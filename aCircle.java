
public class aCircle extends Shape {
	


	// Constructor with parent properties
		public aCircle(double dim1, double dim2) 
		{
			super(dim1, dim2);
		}

		public double getArea() {
			
			return super.getPI() * Math.pow(super.getDim1(), 2);
		}

}
