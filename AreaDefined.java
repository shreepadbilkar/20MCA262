package shape;

public class AreaDefined
{
    public Double square(Double a)
    {
        return a*a;
    }
    public Double triangle(Double base,Double height)
    {
        return (base*height)/2;
    }
    public Double circle(Double radius)
    {
        return 2*3.14*radius;
    }
}