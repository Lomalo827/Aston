package Module3.Decorator;

public abstract class NotificationDecorator implements Notification{
    protected Notification decoratedSimpleNotification;

    public NotificationDecorator(Notification decoratedSimpleNotification) {
        this.decoratedSimpleNotification = decoratedSimpleNotification;
    }

    @Override
    public void send(){
        decoratedSimpleNotification.send();
    }

}
