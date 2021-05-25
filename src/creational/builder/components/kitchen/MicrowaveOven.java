package creational.builder.components.kitchen;

import creational.builder.components.PrintInfoAble;

public class MicrowaveOven implements PrintInfoAble
{
    private String company;
    private int modesNumber;
    private boolean defrosts;

    public MicrowaveOven(String company, int modesNumber, boolean defrosts)
    {
        this.company = company;
        this.modesNumber = modesNumber;
        this.defrosts = defrosts;
    }

    @Override
    public void printInfo()
    {
        System.out.println("Microwave oven was made by " + company + ".");
        System.out.println("It has " + modesNumber + " modes.");
        if(defrosts)
            System.out.println("It can defrost.");
        else
            System.out.println("It can't defrost.");
    }
}
