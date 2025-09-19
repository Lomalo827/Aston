package Module3.ChainOfResponsibility;

public abstract class ResponseHandler {

    private ResponseHandler next;
    public void setNext(ResponseHandler nextHandler){
        this.next=nextHandler;
    }

    public void checkNext(Resposne resposne){
        if (next!=null){
            next.handle(resposne);
        }
    }
    public abstract void handle(Resposne resposne);
}
