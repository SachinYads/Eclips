package sachinworld;

public class Square extends Shape
{
    public double getArea()
    {
        return 2 *(getHeight() * getBase());
    }
}