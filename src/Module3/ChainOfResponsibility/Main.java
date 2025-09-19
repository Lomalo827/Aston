package Module3.ChainOfResponsibility;

public class Main {
    public static void main (String[] args){
        Resposne resposne = new Resposne("SUCCESS",0);
        Resposne badResposne = new Resposne("ERROR",0);
        ResponseHandler responseHandler = new StatusHandler();
        responseHandler.setNext(new CodeHandler());
        responseHandler.handle(resposne);
        responseHandler.handle(badResposne);
    }
}
