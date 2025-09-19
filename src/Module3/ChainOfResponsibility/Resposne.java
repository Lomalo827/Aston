package Module3.ChainOfResponsibility;

public class Resposne {
    private String status;
    private int code;

    public Resposne(String status, int code) {
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
