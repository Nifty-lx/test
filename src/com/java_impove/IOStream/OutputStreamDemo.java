package com.java_impove.IOStream;

import java.io.*;

public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //定义元数据文件
        File src = new File("test4.txt");
        //定义目的文文件
        File dest = new File("aaa.txt");
        //创建输入流对象
        InputStream inputStream = null;
        //创建输出流对象
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(src);
            outputStream = new FileOutputStream(dest);

            //带缓存的输入输出方式
            byte[] buffer = new byte[1024];
            int length = 0;

            while ((length = inputStream.read(buffer))!=-1){
                outputStream.write(buffer);
            }
        }catch (FileNotFoundException e){

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            outputStream.close();
            inputStream.close();
        }

    }
}
