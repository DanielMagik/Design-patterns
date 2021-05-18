package main;

import creational.singleton.Singleton;

public class Main
{
    public static void main(String[] args)
    {
        Main main = new Main();
        main.runSingleton();

    }
    private void runSingleton()
    {
        Singleton singleton = Singleton.INSTANCE;
        Singleton singleton1 = Singleton.INSTANCE;

        System.out.println(singleton==singleton1);

        singleton.addElement("A");
        singleton.addElement("B");
        singleton.addElement("C");

        singleton1.addElement("1");
        singleton1.addElement("2");
        singleton1.addElement("3");

        for(String s :singleton.getList())
        {
            System.out.println(s);
        }

        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println("----------");
        for(String s :singleton2.getList())
        {
            System.out.println(s);
        }

        System.out.println(singleton==singleton1 && singleton1==singleton2 && singleton==singleton2);
    }
}
