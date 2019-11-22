import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class multicastReciver {
    public static void main(String[] args) {
        hrkhan();
        try {
            InetAddress group =InetAddress.getByName("225.4.5.6");
            MulticastSocket multicastsock = new MulticastSocket(3456);
            multicastsock.joinGroup(group);
            byte[] buffer = new byte[100];

            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            multicastsock.receive(packet);
            String message = new String(buffer);
            System.out.println("the message is      " + message);
            multicastsock.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void hrkhan()
    {
        System.out.println();
        System.out.println("Name : - Habiburrahman");
        System.out.println("Roll no :- 17BCS071 ");
        System.out.println("B-Tech 5th Semester ");
        System.out.println();
    }
}
