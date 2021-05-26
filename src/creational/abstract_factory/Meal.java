package creational.abstract_factory;

import creational.abstract_factory.appetizer.Appetizer;
import creational.abstract_factory.drinks.Drink;
import creational.abstract_factory.factories.MealFactory;

public class Meal
{
    private Drink drink;
    private Appetizer appetizer;

    public Meal(MealFactory mealFactory, int percents)
    {
        drink = mealFactory.createDrink(percents);
        appetizer = mealFactory.createAppetizer();
    }
    public void consume()
    {
        drink.drink();
        appetizer.eat();
    }
}
