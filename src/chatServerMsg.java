import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class chatServerMsg {
    public static void main(String[] args) throws Exception {
        hrkhan();
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("server started ");
        Socket soc =ss.accept();
        System.out.println("client conneected ");
        InputStreamReader in = new InputStreamReader(soc.getInputStream());
        OutputStreamWriter os = new OutputStreamWriter(soc.getOutputStream());
        PrintWriter out = new PrintWriter(os);
        BufferedReader brmsg = new BufferedReader(in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String clientMsg="" ,serverMsg="" ;

        while(!serverMsg.equals("bye")) {
             serverMsg =brmsg.readLine();
            System.out.println("client says   : " + serverMsg);
            System.out.println("Enter Msg");

             clientMsg = br.readLine();
            out.println(clientMsg);
            os.flush();
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
