package creational.abstract_factory.drinks;

public class Beer extends Drink
{
    private String type;

    public Beer(int percents, String type)
    {
        super(percents);
        this.type = type;
    }

    @Override
    public void drink()
    {
        if(!full)
            System.out.println("You can't drink this beer. Glass is empty!");
        else
        {
            System.out.println("You are drinking beer.");
            if(percents>6)
                System.out.println("This beer is strong!");
            if(!type.equals("IPA") && !type.equals("APA"))
                System.out.println("This is good beer.");
            full=false;
        }
    }
}
