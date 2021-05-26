package creational.abstract_factory.factories;

import creational.abstract_factory.appetizer.Appetizer;
import creational.abstract_factory.appetizer.Herring;
import creational.abstract_factory.drinks.Drink;
import creational.abstract_factory.drinks.Vodka;

public class VodkaFactory implements MealFactory
{
    @Override
    public Drink createDrink(int percents)
    {
        return new Vodka(percents,5);
    }

    @Override
    public Appetizer createAppetizer()
    {
        return new Herring();
    }
}
