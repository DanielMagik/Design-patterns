package creational.singleton;

public class NoEnumSingleton
{

    private String name;
    private static volatile NoEnumSingleton instance;
    private NoEnumSingleton(String name)
    {
        this.name = name;
    }
    public static NoEnumSingleton getInstance()
    {
        if(instance != null)
            return instance;

        synchronized (NoEnumSingleton.class)
        {
            if(instance == null)
                instance = new NoEnumSingleton("name");

            return instance;
        }

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
