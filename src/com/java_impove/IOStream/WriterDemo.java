package com.java_impove.IOStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
//最保险的方式：在输出关闭之前每次都flush一下，然后再关闭。
//当某一个输出流带缓冲区的时候，需要进行flush。
public class WriterDemo {
    public static void main(String[] args) {
        File file = new File("test.png");
        Writer writer = null;
        try {
            writer = new FileWriter(file);
            writer.write("lixiangtest");
            writer.write("lixiangtest");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
