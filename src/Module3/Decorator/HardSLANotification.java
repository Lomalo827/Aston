package Module3.Decorator;

public class HardSLANotification extends NotificationDecorator {
    public HardSLANotification(Notification decoratedSimpleNotification) {
        super(decoratedSimpleNotification);
    }
    @Override
    public void send(){
        decoratedSimpleNotification.send();
        System.out.println("Сообщению указан срок ответа");
    }
}
