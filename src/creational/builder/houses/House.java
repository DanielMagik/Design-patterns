package creational.builder.houses;

import creational.builder.components.PrintInfoAble;
import creational.builder.components.bathroom.Bathroom;
import creational.builder.components.bedroom.Bedroom;
import creational.builder.components.enums.Color;
import creational.builder.components.enums.HouseType;
import creational.builder.components.kitchen.Kitchen;

import java.util.List;

public class House implements PrintInfoAble
{
    private final HouseType houseType;
    private final Color houseColor;
    private final Bathroom bathroom;
    private final List<Bedroom> bedrooms;
    private final Kitchen kitchen;

    public House(HouseType houseType, Color houseColor, Bathroom bathroom, List<Bedroom> bedrooms, Kitchen kitchen)
    {
        this.houseType = houseType;
        this.houseColor = houseColor;
        this.bathroom = bathroom;
        this.bedrooms = bedrooms;
        this.kitchen = kitchen;
    }

    @Override
    public void printInfo()
    {
        if(houseType != null)
            System.out.println("House type is " + houseType + ".");
        if(houseColor != null)
            System.out.println("House color is " + houseColor + ".");
        if(bathroom != null)
        {
            System.out.println("There is bathroom inside.");
            bathroom.printInfo();
        }
        if(kitchen != null)
        {
            System.out.println("There is kitchen inside.");
            kitchen.printInfo();
        }
        if(bedrooms != null)
        {
            System.out.println("We have " + bedrooms.size() + " bedrooms inside.");
            for( Bedroom b : bedrooms)
            {
                if(b!=null)
                {
                    System.out.println("\n");
                    b.printInfo();
                }
                else
                    System.out.println("That room doesn't exist!");
            }
        }
    }
}
