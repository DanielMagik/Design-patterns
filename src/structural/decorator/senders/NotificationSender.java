package structural.decorator.senders;

public class NotificationSender implements Sender
{
    private String message;

    public NotificationSender(String message)
    {
        this.message = message;
    }

    @Override
    public void sendNotification()
    {

    }

    @Override
    public String getMessage()
    {
        return message;
    }
}
