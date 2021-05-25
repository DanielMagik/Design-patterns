package creational.builder.components.kitchen;

import creational.builder.components.PrintInfoAble;

import java.time.LocalDateTime;

public class Bakery implements PrintInfoAble
{
    private String company;
    private int maxTemperature;
    private int productionYear;

    public Bakery(String company, int maxTemperature, int productionYear)
    {
        this.company = company;
        this.maxTemperature = maxTemperature;
        this.productionYear = productionYear;
    }

    @Override
    public void printInfo()
    {
        System.out.println("Bakery was made by " + company + ".");
        System.out.println("Max temperature is " + maxTemperature + ".");
        System.out.println("It is " + (LocalDateTime.now().getYear() - productionYear) + " years old.");
    }
}
