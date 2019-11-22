import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class chatClientMsg {
    public static void main(String[] args) throws Exception{
        hrkhan();
        String ip  ="localhost";
        int port = 9999;
        Socket soc = new Socket(ip , port);

        OutputStreamWriter os = new OutputStreamWriter(soc.getOutputStream());
        InputStreamReader in = new InputStreamReader(soc.getInputStream());
        PrintWriter out = new PrintWriter(os);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader brmsg = new BufferedReader(in );
           String clientMsg="" ,serverMsg="" ;
        while(!clientMsg.equals("bye")) {
            System.out.println("Enter Msg");
            clientMsg = br.readLine();
            out.println(clientMsg);
            os.flush();
            serverMsg  = brmsg.readLine();
            System.out.println("Server  says   : " + serverMsg);
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
