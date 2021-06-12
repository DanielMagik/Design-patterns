package structural.decorator.decorators;

import structural.decorator.senders.Sender;

public class SenderDecorator implements Sender
{
    private Sender wrappee;

    public SenderDecorator(Sender wrappee)
    {
        this.wrappee = wrappee;
    }

    @Override
    public void sendNotification()
    {
        wrappee.sendNotification();
    }

    @Override
    public String getMessage()
    {
        return wrappee.getMessage();
    }
}
