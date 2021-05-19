package main;

import creational.singleton.NoEnumSingleton;
import creational.singleton.EnumSingleton;

public class Main
{
    public static void main(String[] args)
    {
        Main main = new Main();
        main.runNoEnumSingleton();

    }
    private void runEnumSingleton()
    {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;

        System.out.println(singleton == singleton1);

        singleton.addElement("A");
        singleton.addElement("B");
        singleton.addElement("C");
        singleton1.deleteElement(0);

        singleton1.addElement("1");
        singleton1.addElement("2");
        singleton1.addElement("3");
        singleton.deleteElement(3);

        for(String s : singleton.getList())
        {
            System.out.println(s);
        }

        EnumSingleton singleton2 = EnumSingleton.INSTANCE;
        System.out.println("----------");
        for(String s : singleton2.getList())
        {
            System.out.println(s);
        }

        System.out.println(singleton == singleton1 && singleton1 == singleton2 && singleton == singleton2);
    }
    private void runNoEnumSingleton()
    {
        NoEnumSingleton singleton = NoEnumSingleton.getInstance();
        NoEnumSingleton singleton1 = NoEnumSingleton.getInstance();
        System.out.println(singleton==singleton1);

        System.out.println(singleton.getName() + " == " + singleton1.getName() + " is " +
                singleton.getName().equals(singleton1.getName()));

        singleton.setName("My name is Singleton");

        System.out.println(singleton.getName() + " == " + singleton1.getName() + " is " +
                singleton.getName().equals(singleton1.getName()));
        NoEnumSingleton singleton2 = NoEnumSingleton.getInstance();
        System.out.println(singleton2.getName());
        System.out.println(singleton==singleton1 && singleton1==singleton2 && singleton==singleton2);
    }
}
