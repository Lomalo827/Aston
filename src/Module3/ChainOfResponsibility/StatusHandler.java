package Module3.ChainOfResponsibility;

import java.util.logging.Handler;

public class StatusHandler extends ResponseHandler{

    @Override
    public void handle(Response response) {
        if(response.getStatus().equals("SUCCESS")){
            System.out.println("ResponseHandler: SUCCESS");
        }else setNext(new ErrorHandler());

        checkNext(response);
    }
}
