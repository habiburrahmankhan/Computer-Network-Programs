import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class chatserver {
    public static void main(String[] args) throws Exception {
        hrkhan();
        Scanner s = new Scanner(System.in);
        InetAddress ip  = InetAddress.getByName("192.168.1.103") ;
        ServerSocket ss = new ServerSocket(8080 , 0 , ip);
        System.out.println("server started ready to connect ..... ");
        Socket soc =ss.accept();
        System.out.println("client conneected  to my server ");
        System.out.println(soc);
        DataInputStream din = new DataInputStream(soc.getInputStream());
        DataOutputStream dout = new DataOutputStream(soc.getOutputStream());
        while(true) {
            System.out.println("client says  : - " + din.readUTF());
            System.out.println("enter msg ");
            dout.writeUTF(s.nextLine());
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
