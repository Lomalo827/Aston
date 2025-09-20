package Module3.Decorator;

public class SimpleNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Сообщение отправлено пользователю");
    }
}
