package Module3.ChainOfResponsibility;

public class CodeHandler extends ResponseHandler{

    @Override
    public void handle(Response response) {
        if(response.getCode()==0){
            System.out.println("CodeHandler");
        }else setNext(new ErrorHandler());

        checkNext(response);
    }
}
