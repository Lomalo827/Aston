package Module3.ChainOfResponsibility;

public class ErrorHandler extends ResponseHandler{
    @Override
    public void handle(Resposne resposne) {
        System.out.println("Произошла ошибка при валидации ответа");
    }
}
