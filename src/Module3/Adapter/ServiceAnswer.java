package Module3.Adapter;

public class ServiceAnswer {
    private int message_id;
    private String status;

    public ServiceAnswer(int message_id, String status) {
        this.message_id = message_id;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public int getMessage_id() {
        return message_id;
    }
}
