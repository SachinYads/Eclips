package sachinworld;

public abstract class Shape
{
   private double height;   
   private double base; 

  
   public void setValues(double height, double width)
   {
      this.height = height;
      this.base = base;
   }

   public double getHeight() 
   {
       return height;
   }
     
   public double getBase() 
   {
       return base;
   } 


public abstract double getArea(double base,double height);
}
