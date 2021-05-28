package main;

import creational.abstract_factory.Meal;
import creational.abstract_factory.factories.BeerFactory;
import creational.abstract_factory.factories.MealFactory;
import creational.builder.Director;
import creational.builder.builders.DetachedHouseBuilder;
import creational.builder.builders.VillaBuilder;
import creational.builder.houses.Villa;
import creational.factory_method.logistic.Logistics;
import creational.factory_method.logistic.ShipsLogistics;
import creational.factory_method.logistic.TrucksLogistics;
import creational.prototype.Circle;
import creational.prototype.Rectangle;
import creational.prototype.Shape;
import creational.singleton.NoEnumSingleton;
import creational.singleton.EnumSingleton;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Main main = new Main();
        main.runFactoryMethod();

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
    private void runBuilder()
    {
        Director director = new Director();
        DetachedHouseBuilder builder = new DetachedHouseBuilder();
        director.buildDetachedHouse(builder);
        //DetachedHouse detachedHouse = builder.getResult();

        VillaBuilder villaBuilder = new VillaBuilder();
        director.buildVilla(villaBuilder);
        Villa villa = villaBuilder.getResult();
        villa.printInfo();

    }
    private void runPrototype()
    {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(20);
        circle.setRadius(5);
        circle.setColor("White");
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(-10);
        rectangle.setY(32);
        rectangle.setColor("Purple");
        rectangle.setWidth(12);
        rectangle.setHeight(7);
        shapes.add(rectangle);
        Rectangle anotherRectangle = (Rectangle) rectangle.clone();
        shapes.add(anotherRectangle);

        for (Shape shape : shapes)
        {
            shapesCopy.add(shape.clone());
        }
        for(int i = 0; i < shapes.size(); i++)
        {
            Shape shape1 = shapes.get(i);
            Shape shape2 = shapesCopy.get(i);
            if(shape1 instanceof Circle)
            {
                Circle circle1 = (Circle) shape1;
                Circle circle2 = (Circle) shape2;
                if(circle1.equals(circle2))
                    System.out.println("Circle 1 equals circle 2.");
            }
            else
            {
                Rectangle rectangle1 = (Rectangle) shape1;
                Rectangle rectangle2 = (Rectangle) shape2;
                if(rectangle1.equals(rectangle2))
                    System.out.println("Rectangle 1 equals rectangle 2.");
            }
        }
    }
    private void runAbstractFactory()
    {
        MealFactory mealFactory = new BeerFactory();
        Meal meal = new Meal(mealFactory,6);
        meal.consume();
        System.out.println("\n");
        meal.consume();
    }
    private void runFactoryMethod()
    {
        Logistics logistics = new TrucksLogistics();
        logistics.perform();
        logistics = new ShipsLogistics();
        logistics.perform();
    }

}
