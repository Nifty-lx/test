package com.java_impove.IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadDemo {
    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = new FileReader("test4.txt");
            //字符流可以直接读数据，而字节流处理数据会出现乱码
            int read = 0;
            char[] buff = new char[1024];
            int length = 0;
            while ((length = reader.read(buff))!=-1){
                System.out.println(new String(buff, 0, length));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
