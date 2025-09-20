package Module3.Adapter;

import java.util.HashMap;

public class StorageAdapter implements AnswerStorage{
    private ServiceAnswer serviceAnswer;
    private HashMap<Integer,String> bucket;

    public StorageAdapter(ServiceAnswer serviceAnswer) {
        this.serviceAnswer = serviceAnswer;
        bucket = new HashMap<>();
    }

    @Override
    public void store() {
        bucket.put(serviceAnswer.getMessage_id(),serviceAnswer.getStatus());
    }

    @Override
    public HashMap<Integer, String> returnResults() {
        return bucket;
    }
}
