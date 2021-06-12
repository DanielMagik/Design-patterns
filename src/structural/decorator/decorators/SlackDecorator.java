package structural.decorator.decorators;

import structural.decorator.senders.Sender;

public class SlackDecorator extends SenderDecorator
{
    public SlackDecorator(Sender wrappee)
    {
        super(wrappee);
    }

    @Override
    public void sendNotification()
    {
        super.sendNotification();
        System.out.println("Sending a Slack notification: " + getMessage());
    }

}
