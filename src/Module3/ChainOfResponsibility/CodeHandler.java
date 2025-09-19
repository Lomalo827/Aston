package Module3.ChainOfResponsibility;

public class CodeHandler extends ResponseHandler{

    @Override
    public void handle(Resposne resposne) {
        if(resposne.getCode()==0){
            System.out.println("CodeHandler");
        }else setNext(new ErrorHandler());

        checkNext(resposne);
    }
}
