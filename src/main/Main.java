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
import structural.adapter.music.MP3;
import structural.adapter.music.MP4;
import structural.adapter.music.MediaType;
import structural.adapter.adapter.MP4Adapter;
import structural.adapter.players.MP3Player;
import structural.bridge.humans.Athlete;
import structural.bridge.humans.Strongman;
import structural.bridge.workouts.Gym;
import structural.bridge.workouts.StreetWorkout;
import structural.bridge.workouts.Workout;
import structural.decorator.decorators.EmailDecorator;
import structural.decorator.decorators.SlackDecorator;
import structural.decorator.senders.NotificationSender;
import structural.decorator.decorators.FacebookDecorator;
import structural.decorator.decorators.SMSDecorator;
import structural.object_tree.Building;
import structural.object_tree.District;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Main main = new Main();
        main.runDecorator();

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
    private void runAdapter()
    {
        MP3 song1 = new MP3();
        List<Byte> song2Bytes = Arrays.asList((byte) 1,(byte)15,(byte)100, (byte)32);
        MP3 song2 = new MP3("Pink wine","Feduk",song2Bytes);

        MP3Player mp3Player = new MP3Player("Sony");
        mp3Player.play(song1);
        mp3Player.play(song2);

        List<Integer> mp4Bytes = Arrays.asList(1,12,50,100,200,555,1026,1402);
        MP4 MP4Song = new MP4("Gazirovka","Black",mp4Bytes, MediaType.AUDIO);

        MP4Adapter mp4Adapter = new MP4Adapter(MP4Song);
        mp3Player.play(mp4Adapter);
    }
    private void runBridge()
    {
        Workout gym = new Gym(20,20,50);
        Workout streetWorkout = new StreetWorkout(true, 0, 0);
        Athlete gymAthlete = new Athlete(gym);
        Athlete streetWorkouter = new Athlete(streetWorkout);
        Workout strongmanGym = new Gym(0,0,0);
        Strongman strongman = new Strongman(strongmanGym);

        for(int i = 0; i < 50; i++)
        {
            gymAthlete.doPushWorkout();
            gymAthlete.doPullWorkout();
            gymAthlete.doLegsWorkout();
        }
        gymAthlete.doLegsWorkout();
        gymAthlete.getWorkoutStatus();


        for(int i = 0; i < 30; i++)
        {
            streetWorkouter.doPullWorkout();
            streetWorkouter.doPushWorkout();
        }

        streetWorkouter.getWorkoutStatus();
        for(int i = 0; i < 5; i++)
            strongman.injectTestosterone();
        strongman.getWorkoutStatus();



    }
    private void runComponent()
    {
        Building building1 = new Building("Adam's house","Andrea's street 12C");
        Building building2 = new Building("Eva's house","Andrea's street 12D");
        District district1 = new District("John's Camp",Arrays.asList(building1,building2));
        Building building3 = new Building("Cindy's house", "Linkoln street 124");
        District district2 = new District("New Island", Arrays.asList(building3));
        Building building4 = new Building("Olivia's house","King's street 10");
        District smallCity = new District("Small city", Arrays.asList(district1,district2,building4));

        Building b1 = new Building("Andy's house","Arnold's street 1001");
        Building b2 = new Building("Mackenzie's house","Arnold's street 1002");
        Building b3 = new Building("Derek's house","Arnold's street 1003");
        Building b4 = new Building("Beth's house","Sylwester's street 1");
        District district3 = new District("Long Island",Arrays.asList(b1,b2,b3,b4));
        Building b5 = new Building("Tony's house", "Widow street 93A");
        Building b6 = new Building("Peter's house", "Widow street 93B");
        District district4 = new District("Black Widow District",Arrays.asList(b5,b6,district3));
        Building building5 = new Building("Mayor's Residence","Main street 1");
        District city = new District("Big City",Arrays.asList(smallCity,district4,building5));
        city.printStatus(0);



    }
    private void runDecorator()
    {
        SMSDecorator decorator = new SMSDecorator(
                new SlackDecorator(
                        new FacebookDecorator(
                                new EmailDecorator(
                                        new NotificationSender("This is Sparta!")
                                )
                        )
                )
        );
        decorator.sendNotification();

    }

}
