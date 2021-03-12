package netTest;

import org.junit.Test;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class UdpTest {
@Test
        public void sender() throws IOException {
            DatagramSocket socket=new DatagramSocket();
            String str="udp style";
            byte[] data=str.getBytes(StandardCharsets.UTF_8);
            InetAddress inet=InetAddress.getLocalHost();
            DatagramPacket packet=new DatagramPacket(data,0,data.length,inet,9090);
            socket.send(packet);
            socket.close();

        }

@Test
    public void receiver() throws IOException {
            DatagramSocket socket=new DatagramSocket(9090);
            byte[] buff=new byte[100];
            DatagramPacket packet = new DatagramPacket(buff,0,buff.length);
            socket.receive(packet);
            System.out.println(new String(packet.getData(),0,packet.getLength()));
            socket.close();
        }


}
