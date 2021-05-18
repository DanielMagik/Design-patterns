package creational.singleton;

import java.util.*;

public enum Singleton
{
    INSTANCE;
    private List<String> list;

    Singleton()
    {
        list = Collections.synchronizedList(new ArrayList<>());
    }

    public void addElement(String s)
    {
        list.add(s);
    }

    public void deleteElement(int index)
    {
        list.remove(index);
    }

    public List<String> getList()
    {
        return list;
    }
}
