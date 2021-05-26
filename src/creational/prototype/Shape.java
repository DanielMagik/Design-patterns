package creational.prototype;

public abstract class Shape
{
    private int x;
    private int y;
    private String color;

    public Shape() {}

    public Shape(Shape shape)
    {
        if(shape != null)
        {
            this.x = shape.x;
            this.y = shape.y;
            this.color = shape.color;
        }
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public abstract Shape clone();
    @Override
    public boolean equals(Object instance)
    {
        if(!(instance instanceof Shape))
            return false;
        Shape shape = (Shape) instance;
        return shape.x == this.x && shape.y == this.y && shape.color.equals(this.color);
    }
}
