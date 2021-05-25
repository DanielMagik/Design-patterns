package creational.builder.builders;

import creational.builder.components.SwimmingPool;
import creational.builder.components.bathroom.Bathroom;
import creational.builder.components.bedroom.Bedroom;
import creational.builder.components.enums.Color;
import creational.builder.components.enums.HouseType;
import creational.builder.components.kitchen.Kitchen;
import creational.builder.components.livingroom.LivingRoom;
import creational.builder.houses.Villa;

import java.util.List;

public class VillaBuilder implements Builder
{
    private HouseType houseType;
    private Color houseColor;
    private Bathroom bathroom;
    private List<Bedroom> bedrooms;
    private Kitchen kitchen;
    private LivingRoom livingRoom;
    private SwimmingPool swimmingPool;

    @Override
    public void setHouseType(HouseType houseType)
    {
        this.houseType = houseType;
    }

    @Override
    public void setHouseColor(Color houseColor)
    {
        this.houseColor = houseColor;
    }

    @Override
    public void setBathroom(Bathroom bathroom)
    {
        this.bathroom = bathroom;
    }

    @Override
    public void setBedrooms(List<Bedroom> bedrooms)
    {
        this.bedrooms = bedrooms;
    }

    @Override
    public void setKitchen(Kitchen kitchen)
    {
        this.kitchen = kitchen;
    }

    @Override
    public void setLivingRoom(LivingRoom livingRoom)
    {
        this.livingRoom = livingRoom;
    }

    @Override
    public void setSwimmingPool(SwimmingPool swimmingPool)
    {
        this.swimmingPool = swimmingPool;
    }

    public Villa getResult()
    {
        return new Villa(houseType,houseColor,bathroom,bedrooms,kitchen,livingRoom,swimmingPool);
    }
}
