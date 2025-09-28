package Module4.Ex1;

public class Main {
    public static void main(String[] args) {

        DeadLockExample deadLockExample = new DeadLockExample();

        Thread DeadLockthread1 = new Thread(()->{
           while (true){
               deadLockExample.method1();
           }
        });

        Thread DeadLockthread2 = new Thread(()->{
           while (true){
               deadLockExample.method2();
           }
        });

        DeadLockthread1.start();
        DeadLockthread2.start();

    }
}
