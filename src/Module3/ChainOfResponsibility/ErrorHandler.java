package Module3.ChainOfResponsibility;

public class ErrorHandler extends ResponseHandler{
    @Override
    public void handle(Response response) {
        System.out.println("Произошла ошибка при валидации ответа");
    }
}
