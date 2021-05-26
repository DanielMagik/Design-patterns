package creational.abstract_factory.factories;

import creational.abstract_factory.appetizer.Appetizer;
import creational.abstract_factory.appetizer.Chips;
import creational.abstract_factory.drinks.Beer;
import creational.abstract_factory.drinks.Drink;

public class BeerFactory implements MealFactory
{
    @Override
    public Drink createDrink(int percents)
    {
        return new Beer(percents,"Lager");
    }

    @Override
    public Appetizer createAppetizer()
    {
        return new Chips();
    }
}
