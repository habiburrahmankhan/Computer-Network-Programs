import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class chatclient {
    public static void main(String[] args) throws Exception{
        hrkhan();
        String ip  ="192.168.1.113";
        int port = 8080;
        Socket soc = new Socket(ip , port);
        System.out.println(soc);
        Scanner s= new Scanner(System.in);
//        OutputStreamWriter os = new OutputStreamWriter(soc.getOutputStream());
//        InputStreamReader in = new InputStreamReader(soc.getInputStream());
        DataInputStream din = new DataInputStream(soc.getInputStream());
        DataOutputStream dout = new DataOutputStream(soc.getOutputStream());

             while(true)
             {
                 System.out.println("enter Msg ");
                 dout.writeUTF(s.nextLine());
                 System.out.println("Server  says   : " + din.readUTF());
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
