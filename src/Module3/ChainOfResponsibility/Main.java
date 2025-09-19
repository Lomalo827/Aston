package Module3.ChainOfResponsibility;

public class Main {
    public static void main (String[] args){
        Response response = new Response("SUCCESS",0);
        Response badResponse = new Response("ERROR",0);
        ResponseHandler responseHandler = new StatusHandler();
        responseHandler.setNext(new CodeHandler());
        responseHandler.handle(response);
        responseHandler.handle(badResponse);
    }
}
