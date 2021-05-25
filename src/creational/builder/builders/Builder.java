package creational.builder.builders;

import creational.builder.components.SwimmingPool;
import creational.builder.components.bathroom.Bathroom;
import creational.builder.components.bedroom.Bedroom;
import creational.builder.components.enums.Color;
import creational.builder.components.enums.HouseType;
import creational.builder.components.kitchen.Kitchen;
import creational.builder.components.livingroom.LivingRoom;

import java.util.*;

public interface Builder
{
    void setHouseType(HouseType houseType);
    void setHouseColor(Color color);
    void setBathroom(Bathroom bathroom);
    void setBedrooms(List<Bedroom> bedrooms);
    void setKitchen(Kitchen kitchen);
    void setLivingRoom(LivingRoom livingRoom);
    void setSwimmingPool(SwimmingPool swimmingPool);
}
