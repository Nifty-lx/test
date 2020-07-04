package com.java_impove.IOStream;

import java.io.*;

public class ImputSreamReaderDemo {
    public static void main(String[] args) {
        File file = new File("123.txt");
        FileInputStream fileInputStream = null;
        InputStreamReader inputStreamReader = null;
        try {
            fileInputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");
            char[] chars = new char[1024];
            //读取的数据较少，不会占用1024个缓冲区
            int length = inputStreamReader.read(chars);
            System.out.println(new String(chars, 0, length));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
                inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
