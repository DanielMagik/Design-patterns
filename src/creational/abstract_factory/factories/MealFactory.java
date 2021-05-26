package creational.abstract_factory.factories;

import creational.abstract_factory.appetizer.Appetizer;
import creational.abstract_factory.drinks.Drink;

public interface MealFactory
{
    Drink createDrink(int percents);
    Appetizer createAppetizer();
}
