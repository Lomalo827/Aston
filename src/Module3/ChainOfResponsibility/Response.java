package Module3.ChainOfResponsibility;

public class Response {
    private String status;
    private int code;

    public Response(String status, int code) {
        this.status = status;
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public int getCode() {
        return code;
    }
}
