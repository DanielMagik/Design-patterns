package structural.decorator.decorators;

import structural.decorator.senders.Sender;

public class EmailDecorator extends SenderDecorator
{
    public EmailDecorator(Sender wrappee)
    {
        super(wrappee);
    }

    @Override
    public void sendNotification()
    {
        super.sendNotification();
        System.out.println("Sending an e-mail notification: " + getMessage());
    }
}
