package Module4.Ex2;

public class Printer {
    private String messageToPrint;
    private static boolean flag = true;
    private static final Object lock = new Object();

    public Printer(String messageToPrint) {
        this.messageToPrint = messageToPrint;
    }
    public void printOne() {
        while (true){
            synchronized (lock){
                while(!flag){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(messageToPrint);
                flag=false;
                lock.notifyAll();
            }
        }
    }
    public void printTwo(){
        while (true){
            synchronized (lock){
                while(flag){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(messageToPrint);
                flag=true;
                lock.notifyAll();
            }
        }
    }


}
