package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory
{
    private Map<String, Shape> map = new HashMap<>();

    public PrototypeFactory()
    {
        Circle circle = new Circle();
        circle.setX(0);
        circle.setY(0);
        circle.setColor("Blue");
        circle.setRadius(100);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(0);
        rectangle.setY(0);
        rectangle.setColor("Red");
        rectangle.setWidth(100);
        rectangle.setHeight(50);

        map.put("Big blue circle", circle);
        map.put("Big red rectangle",rectangle);
    }
    public Shape put(String key, Shape value)
    {
        map.put(key,value);
        return value;
    }
    public Shape get(String key)
    {
        return map.get(key).clone();
    }
}
