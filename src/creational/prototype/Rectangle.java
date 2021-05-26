package creational.prototype;

public class Rectangle extends Shape
{
    private int width;
    private int height;

    public Rectangle() {}

    public Rectangle(Rectangle instance)
    {
        super(instance);
        if (instance != null)
        {
            this.width = instance.width;
            this.height = instance.height;
        }
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    @Override
    public Shape clone()
    {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object instance)
    {
        if (!(instance instanceof Rectangle) || !super.equals(instance))
            return false;
        Rectangle rectangle = (Rectangle) instance;
        return rectangle.width == this.width && rectangle.height == this.height;
    }
}
