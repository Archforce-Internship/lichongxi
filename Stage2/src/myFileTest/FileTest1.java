package myFileTest;

import org.junit.Test;

import java.io.File;

public class FileTest1{
    @Test
    public void test1(){
          File file1=new File("hello.txt");
          File file2=new File("E:\\JavaProject\\Stage2\\src\\myFileTest\\");
          //打印文件名
          String[] list= file2.list();

          //绝对路劲＋文件名
         File[] files=file2.listFiles();
        for (File f: files) {
            System.out.println(f);
        }


       // System.out.println(file1);
       // System.out.println(file2);


      }


}
