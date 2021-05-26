package creational.prototype;

public class Circle extends Shape
{
    private int radius;

    public Circle() {}

    public Circle(Circle instance)
    {
        super(instance);
        if(instance != null)
            this.radius = instance.radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    @Override
    public Shape clone()
    {
        return new Circle(this);
    }
    @Override
    public boolean equals(Object instance)
    {
        if(!(instance instanceof Circle) || !super.equals(instance))
            return false;
        Circle circle = (Circle) instance;
        return circle.radius == this.radius;
    }
}
