package com.java_impove.IOStream;

import java.io.*;

public class CopyPicture {
    public static void main(String[] args) {
        //文件流
        FileReader reader = null;
        FileWriter writer = null;
        //字节流，处理非文本文件需要使用字节流
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            reader = new FileReader("test.png");
            writer = new FileWriter("copyImage.png");
            fileInputStream = new FileInputStream("test.png");
            fileOutputStream = new FileOutputStream("c1.png");
            int length = 0;
            byte[] buff = new byte[1024];
            while ((length=fileInputStream.read(buff))!= -1){
                fileOutputStream.write(buff);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
