package Module4.Ex1;

public class DeadlockExample {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public void method1(){
        synchronized (lock1){
            System.out.println(Thread.currentThread().getName() + " захватил lock1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+ " пытается захватить lock2");
            synchronized (lock2){
                System.out.println(Thread.currentThread().getName()+ " захватил lock2");
            }
        }
    }

    public void method2(){
        synchronized (lock2){
            System.out.println(Thread.currentThread().getName() + " захватил lock2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+ " пытается захватить lock1");
            synchronized (lock1){
                System.out.println(Thread.currentThread().getName()+ " захватил lock1");
            }
        }
    }

}




