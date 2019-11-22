import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class multicastSender {
    public static void main(String[] args) {
        hrkhan();
        try {
            InetAddress group =InetAddress.getByName("225.4.5.6");
            MulticastSocket multicastsock = new MulticastSocket();
            System.out.println("Enter the text to transfer ");
            Scanner s = new Scanner(System.in);
            String message = s.nextLine();
            DatagramPacket packet = new DatagramPacket(message.getBytes() , message.length() , group , 3456);
            multicastsock.send(packet);
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
