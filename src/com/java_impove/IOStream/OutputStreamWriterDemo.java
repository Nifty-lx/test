package com.java_impove.IOStream;

import java.io.*;

public class OutputStreamWriterDemo {
    public static void main(String[] args) {
        File f = new File("123.txt");
        OutputStreamWriter outputStreamWriter = null;
        FileOutputStream fileOutputStream = null;
        try {
             fileOutputStream = new FileOutputStream(f);
             outputStreamWriter = new OutputStreamWriter(fileOutputStream, "utf-8");
             outputStreamWriter.write("99");
             outputStreamWriter.write("我是李响");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //顺序不能颠倒，按照创建顺序的逆序操作。
                outputStreamWriter.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
