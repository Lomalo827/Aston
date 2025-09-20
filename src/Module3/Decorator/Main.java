package Module3.Decorator;

public class Main {
    public static void main(String[] args){

        Notification notification = new SmsNotificationDecorator(new HardSLANotification(new SimpleNotification()));
        notification.send();
    }
}
