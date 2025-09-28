package Module4.Ex1;

public class Main {
    public static void main(String[] args) {

        DeadlockExample deadLockExample = new DeadlockExample();
        Thread deadlockthread1 = new Thread(()->{
           while (true){
               deadLockExample.method1();
           }
        });
        Thread deadlockthread2 = new Thread(()->{
           while (true){
               deadLockExample.method2();
           }
        });

//        deadlockthread1.start();
//        deadlockthread2.start();


        LivelockExample example = new LivelockExample();

        Thread livelockthread1 = new Thread(example::method1);
        Thread livelockthread2 = new Thread(example::method2);

        livelockthread1.start();
        livelockthread2.start();

    }
}
