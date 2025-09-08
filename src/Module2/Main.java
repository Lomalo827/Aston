package Module2;

import java.io.*;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws FileException {
        String dir_path = System.getProperty("user.dir");
        String fileName = "File.txt";
        String filePath = dir_path
                +"\\" + "src"
                +"\\" + Main.class.getPackage().getName()
                +"\\" +fileName;

        String msg = "12";

        MyFileClass myFileClass= new MyFileClass(filePath);
        myFileClass.create_file();
        myFileClass.write_file(msg);
        System.out.println(new String(myFileClass.read_file()));
    }
}
