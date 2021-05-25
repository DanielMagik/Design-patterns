package creational.builder.houses;

import creational.builder.components.SwimmingPool;
import creational.builder.components.bathroom.Bathroom;
import creational.builder.components.bedroom.Bedroom;
import creational.builder.components.enums.Color;
import creational.builder.components.enums.HouseType;
import creational.builder.components.kitchen.Kitchen;
import creational.builder.components.livingroom.LivingRoom;

import java.util.List;

public class Villa extends DetachedHouse
{
    private final SwimmingPool swimmingPool;

    public Villa(HouseType houseType, Color houseColor, Bathroom bathroom, List<Bedroom> bedrooms, Kitchen kitchen, LivingRoom livingRoom, SwimmingPool swimmingPool)
    {
        super(houseType, houseColor, bathroom, bedrooms, kitchen, livingRoom);
        this.swimmingPool = swimmingPool;
    }

    @Override
    public void printInfo()
    {
        super.printInfo();
        if(swimmingPool != null)
        {
            System.out.println("We have swimming pool.");
            swimmingPool.printInfo();
        }
    }
}
