package Module3.Decorator;

public class SmsNotificationDecorator extends NotificationDecorator implements Notification{
    public SmsNotificationDecorator(Notification decoratedSimpleNotification) {
        super(decoratedSimpleNotification);
    }

    public void send() {
        decoratedSimpleNotification.send();
        System.out.println("Сообщение отправлено через SMS");
    }
}
