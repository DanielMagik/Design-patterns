package creational.singleton;

import java.util.*;

public enum EnumSingleton
{
    INSTANCE;
    private List<String> list;

    EnumSingleton()
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
