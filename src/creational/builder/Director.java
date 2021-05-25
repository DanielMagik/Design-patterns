package creational.builder;

import creational.builder.builders.Builder;
import creational.builder.components.SwimmingPool;
import creational.builder.components.bathroom.Bath;
import creational.builder.components.bathroom.Bathroom;
import creational.builder.components.bedroom.Bed;
import creational.builder.components.bedroom.BedType;
import creational.builder.components.bedroom.Bedroom;
import creational.builder.components.enums.Color;
import creational.builder.components.enums.HouseType;
import creational.builder.components.kitchen.Bakery;
import creational.builder.components.kitchen.Kitchen;
import creational.builder.components.kitchen.MicrowaveOven;
import creational.builder.components.livingroom.LivingRoom;
import creational.builder.components.livingroom.TV;
import creational.builder.components.room.Door;
import creational.builder.components.room.Window;

import java.util.*;

public class Director
{
    public void buildDetachedHouse(Builder builder)
    {
        builder.setHouseType(HouseType.DETACHED_HOUSE);
        builder.setHouseColor(Color.YELLOW);

        Window livingRoomWindow1 = new Window(2,Color.BLACK,0.9,true);
        Window livingRoomWindow2 = new Window(2,Color.BLACK,0.7,true);
        Door livingRoomDoor = new Door(Color.BLACK,false);
        LivingRoom livingRoom = new LivingRoom(Color.YELLOW, List.of(livingRoomWindow1,livingRoomWindow2), livingRoomDoor,null);
        builder.setLivingRoom(livingRoom);

        Window kitchenWindow = new Window(2,Color.BLACK,0.4,true);
        Bakery bakery = new Bakery("Sony",300,2015);
        Kitchen kitchen = new Kitchen(Color.GREEN, List.of(kitchenWindow),null,bakery,null);
        builder.setKitchen(kitchen);

        Window bathroomWindow = new Window(1,Color.BLACK,1,true);
        Door bathroomDoor = new Door(Color.WHITE,true);
        Bath bath = new Bath(Color.WHITE,1000,false);
        Bathroom bathroom = new Bathroom(Color.BLUE,List.of(bathroomWindow),bathroomDoor,bath,true);
        builder.setBathroom(bathroom);

        Window bedroomWindow1 = new Window(2,Color.BLACK,0.8,true);
        Window bedroomWindow2 = new Window(2,Color.BLACK,0.7,true);
        Window bedroomWindow3 = new Window(2,Color.BLACK,0.85,true);
        Door bedroomDoor1 = new Door(Color.WHITE,true);
        Door bedroomDoor2 = new Door(Color.WHITE,true);
        Bed bed1 = new Bed(BedType.DOUBLE_BED,Color.GRAY,0.5);
        Bed bed2 = new Bed(BedType.SINGLE_BED,Color.PURPLE,0.8);
        Bedroom bedroom1 = new Bedroom(Color.RED,List.of(bedroomWindow1,bedroomWindow2),bedroomDoor1,bed1);
        Bedroom bedroom2 = new Bedroom(Color.GRAY,List.of(bedroomWindow3),bedroomDoor2,bed2);
        builder.setBedrooms(List.of(bedroom1,bedroom2));



    }
    public void buildVilla(Builder builder)
    {
        builder.setHouseType(HouseType.VILLA);
        builder.setHouseColor(Color.WHITE);

        Window livingRoomWindow1 = new Window(8,Color.BLACK,0.9,true);
        Window livingRoomWindow2 = new Window(8,Color.BLACK,1,true);
        Door livingRoomDoor = new Door(Color.BLACK,false);
        TV tv = new TV("Sony",300);
        LivingRoom livingRoom = new LivingRoom(Color.YELLOW, List.of(livingRoomWindow1,livingRoomWindow2), livingRoomDoor,tv);
        builder.setLivingRoom(livingRoom);

        Window kitchenWindow = new Window(2,Color.BLACK,0.9,true);
        Bakery bakery = new Bakery("Samsung",300,2020);
        MicrowaveOven microwaveOven = new MicrowaveOven("Samsung",10,true);
        Kitchen kitchen = new Kitchen(Color.GREEN, List.of(kitchenWindow),null,bakery,null);
        builder.setKitchen(kitchen);

        Window bathroomWindow = new Window(1,Color.BLACK,1,true);
        Door bathroomDoor = new Door(Color.WHITE,true);
        Bath bath = new Bath(Color.WHITE,5000,true);
        Bathroom bathroom = new Bathroom(Color.BLUE,List.of(bathroomWindow),bathroomDoor,bath,true);
        builder.setBathroom(bathroom);

        Window bedroomWindow1 = new Window(2,Color.BLACK,0.9,true);
        Window bedroomWindow2 = new Window(2,Color.BLACK,1,true);
        Window bedroomWindow3 = new Window(2,Color.BLACK,1,true);
        Window bedroomWindow4 = new Window(2,Color.BLACK,0.99,true);
        Door bedroomDoor1 = new Door(Color.WHITE,true);
        Door bedroomDoor2 = new Door(Color.WHITE,true);
        Door bedroomDoor3 = new Door(Color.WHITE,true);
        Bed bed1 = new Bed(BedType.DOUBLE_BED,Color.GRAY,0.4);
        Bed bed2 = new Bed(BedType.SINGLE_BED,Color.BLUE,0.5);
        Bed bed3 = new Bed(BedType.SINGLE_BED,Color.TURQUOISE,0.6);
        Bedroom bedroom1 = new Bedroom(Color.WHITE,List.of(bedroomWindow1,bedroomWindow2),bedroomDoor1,bed1);
        Bedroom bedroom2 = new Bedroom(Color.GRAY,List.of(bedroomWindow3),bedroomDoor2,bed2);
        Bedroom bedroom3 = new Bedroom(Color.BLUE,List.of(bedroomWindow4),bedroomDoor3,bed3);
        builder.setBedrooms(List.of(bedroom1,bedroom2,bedroom3));
        SwimmingPool swimmingPool = new SwimmingPool(2,5,15,true);
        builder.setSwimmingPool(swimmingPool);
    }
}
