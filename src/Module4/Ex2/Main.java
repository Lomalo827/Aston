package Module4.Ex2;

public class Main {
    public static void main (String[] args) throws InterruptedException {

        Printer printer1 = new Printer("1");
        Printer printer2 = new Printer("2");

        new Thread(printer1::printOne).start();
        new Thread(printer2::printTwo).start();
    }
}
