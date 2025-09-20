package Module3.Adapter;

import java.util.HashMap;

public interface AnswerStorage {

    void store();
    HashMap<Integer,String> returnResults();
}
