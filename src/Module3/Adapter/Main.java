package Module3.Adapter;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){

        HashMap<Integer,String> bucket = new HashMap<>();

        ServiceAnswer serviceAnswer= new ServiceAnswer(1,"SUCCESS");
        AnswerStorage answerStorage = new StorageAdapter(serviceAnswer);
        answerStorage.store();
        bucket=answerStorage.returnResults();
        System.out.println(bucket);
    }
}
