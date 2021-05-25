package creational.builder.houses;

import creational.builder.components.bathroom.Bathroom;
import creational.builder.components.bedroom.Bedroom;
import creational.builder.components.enums.Color;
import creational.builder.components.enums.HouseType;
import creational.builder.components.kitchen.Kitchen;
import creational.builder.components.livingroom.LivingRoom;

import java.util.List;

public class DetachedHouse extends House
{
    private final LivingRoom livingRoom;

    public DetachedHouse(HouseType houseType, Color houseColor, Bathroom bathroom, List<Bedroom> bedrooms, Kitchen kitchen, LivingRoom livingRoom)
    {
        super(houseType, houseColor, bathroom, bedrooms, kitchen);
        this.livingRoom = livingRoom;
    }

    @Override
    public void printInfo()
    {
        super.printInfo();
        if(livingRoom != null)
        {
            System.out.println("We have living room.");
            livingRoom.printInfo();
        }
    }
}
