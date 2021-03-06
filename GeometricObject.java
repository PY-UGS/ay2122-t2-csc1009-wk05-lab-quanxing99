public class GeometricObject 
{
  private String color = "white";
  private boolean filled = false ;
  private java.util.Date dateCreated = new java.util.Date();    
  
  public GeometricObject() {}
  
  public GeometricObject(String color, boolean filled) 
  {
    this.color = color;
    this.filled = filled;
  }
  public String getColor() 
  {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public boolean isFilled() {
    return filled;
  }
  public void setFilled(boolean filled) {
    this.filled = filled;
  }
  public java.util.Date getDateCreated() {
    return dateCreated;
  }
  
  public String toString() 
  {
    return "created on " + this.getDateCreated() + "\n" + "color: " + this.getColor() + " and filled: " + this.isFilled();  
  }
  
  
  
  

  
  
  
  
  
  
}