package structural.decorator.decorators;

import structural.decorator.senders.Sender;

public class FacebookDecorator extends SenderDecorator
{
    public FacebookDecorator(Sender wrappee)
    {
        super(wrappee);
    }

    @Override
    public void sendNotification()
    {
        super.sendNotification();
        System.out.println("Sending a facebook notification: " + getMessage());
    }


}
