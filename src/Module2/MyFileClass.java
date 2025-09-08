package Module2;

import java.io.IOException;
import java.nio.file.*;

public class MyFileClass {

    private String filePath;

    MyFileClass(String filePath){
        this.filePath=filePath;
    }

    public void create_file() throws FileException{
        try{
            Files.createFile(Paths.get(filePath));
        }catch (FileAlreadyExistsException e){
            throw new FileException("File already exists",e);
        }catch (IOException e){
            throw new FileException(e);
        }
    }

    public void write_file(String message) throws FileException{
        try{
            Files.write(Paths.get(filePath),message.getBytes(), StandardOpenOption.APPEND);
        }catch (NoSuchFileException e){
            throw new FileException("File not found",e);
        }catch (IOException e){
            throw new FileException(e);
        }
    }

    public byte[] read_file() throws FileException{
        try {
            return Files.readAllBytes(Paths.get(filePath));
        }catch (NoSuchFileException e){
            throw new FileException("File not found",e);
        }catch (IOException e){
            throw new FileException(e);
        }
    }
}
