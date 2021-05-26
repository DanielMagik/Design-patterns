package creational.abstract_factory.factories;

import creational.abstract_factory.appetizer.Appetizer;
import creational.abstract_factory.appetizer.Dinner;
import creational.abstract_factory.drinks.Drink;
import creational.abstract_factory.drinks.Vine;

public class VineFactory implements MealFactory
{
    @Override
    public Drink createDrink(int percents)
    {
        return new Vine(percents,"Pink");
    }

    @Override
    public Appetizer createAppetizer()
    {
        return new Dinner();
    }
}
