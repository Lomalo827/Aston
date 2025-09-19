package Module3.ChainOfResponsibility;

public abstract class ResponseHandler {

    private ResponseHandler next;
    public void setNext(ResponseHandler nextHandler){
        this.next=nextHandler;
    }

    public void checkNext(Response response){
        if (next!=null){
            next.handle(response);
        }
    }
    public abstract void handle(Response response);
}
