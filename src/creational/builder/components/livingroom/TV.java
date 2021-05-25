package creational.builder.components.livingroom;

import creational.builder.components.PrintInfoAble;

public class TV implements PrintInfoAble
{
    private String company;
    private int channels;

    public TV(String company, int channels)
    {
        this.company = company;
        this.channels = channels;
    }

    @Override
    public void printInfo()
    {
        System.out.println("Tv was made by " + company + ".");
        System.out.println("It has " + channels + " channels.");
    }
}
