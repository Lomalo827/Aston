package Module4.Ex1;

public class LivelockExample {
    private boolean active = true;

    public void method1() {
        while (active) {
            System.out.println("Thread0: Жду Thread1");

            // Имитация ожидания
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            // Всегда уступаем другому потоку
            System.out.println("Thread0 : Уступаю Thread1");
        }
    }

    public void method2() {
        while (active) {
            System.out.println("Thread1: Жду Thread0");

            // Имитация ожидания
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            // Всегда уступаем другому потоку
            System.out.println("Thread1: Уступаю Thread0");
        }
    }

    public void stop() {
        active = false;
    }

}
