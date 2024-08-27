package com.geekbrains.model.writer;

import java.io.*;
import java.io.Writer;

public class FileHandler extends Writer {
    private String filePath;

    public void setPath(String filePath) {
        this.filePath = filePath;
    }
    //- зачем это тут, а главное для чего?
    //почему на семенаре в аналогичном методе в аргументах было Serializable serializable?
    // я не очень понимаю как тут привязать этот интерфейс
    public void write(Serializable human){
        try(ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream("src/family_free/writer/people.bin"))) {
            file.writeObject(human);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    //- зачем это тут, а главное для чего?
    public Object read() {
        try(ObjectInputStream file = new ObjectInputStream(new FileInputStream("src/family_free/writer/people.bin"))) {
            Object human = (Object) file.readObject();
            return human;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {

    }

    @Override
    public void flush() throws IOException {

    }

    @Override
    public void close() throws IOException {

    }
}
