package sachinworld;

public class AbstractDemo
{
    public static void main(String[] args)
    {
        Shape shape;
        
        Rectangle rect = new Rectangle();
        
        shape = rect;
        
        System.out.println(shape.getArea(78, 5));
        
        Square sq = new Square();
        shape = sq;
        
        shape.setValues(34,3);
        
        System.out.println( shape.getArea(34,3));
        
       Parrallelogram pr = new  Parrallelogram();
        
        shape = pr;
        
        shape.setValues(28,3);
        
        System.out.println(shape.getArea(28,3));
    }
}