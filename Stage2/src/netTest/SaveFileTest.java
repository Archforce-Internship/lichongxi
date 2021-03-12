package netTest;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class SaveFileTest {
@Test
    public void client()  {
    Socket socket= null;
    OutputStream os = null;
    FileInputStream fis= null;
    try {

        socket = new Socket(InetAddress.getByName("127.0.0.1"),9090);
        os = socket.getOutputStream();
        fis = new FileInputStream(new File("屏幕截图(1).png"));
        byte[] buffer=new byte[1024];
        int len;

        while((len=fis.read(buffer))!=-1)
        {
            os.write(buffer,0,len);
        }
        /////////////////阻塞IO
        socket.shutdownOutput();
        /////////////////////
        System.out.println("发送完成");

        InputStream inputStream = socket.getInputStream();
        ByteArrayOutputStream ba=new ByteArrayOutputStream();
        byte[] buf=new byte[20];
        int len3;
        while((len3=inputStream.read(buf))!=-1)
        {
            ba.write(buf,0,len3);
        }

        System.out.println(ba.toString());



    } catch (IOException e) {
        e.printStackTrace();
    } finally {

    if(fis!=null){
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(os!=null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(socket!=null) {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    }

    @Test
    public void server() {

        Socket socket1 = null;
        InputStream is1 = null;
        FileOutputStream fos1 = null;
        try {
            ServerSocket ss = new ServerSocket(9090);
            socket1 = ss.accept();
            is1 = socket1.getInputStream();
            fos1 = new FileOutputStream(new File("E:\\JavaProject\\Stage2\\src\\屏幕截图(4).png"));
            byte[] buffer1 = new byte[1024];
            int len1;
            while ((len1 = is1.read(buffer1)) != -1) {
                fos1.write(buffer1, 0, len1);

            }

            System.out.println("接收完成");
            OutputStream os2=socket1.getOutputStream();
            os2.write("I have copyed".getBytes(StandardCharsets.UTF_8));
            os2.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                socket1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                is1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }




}
