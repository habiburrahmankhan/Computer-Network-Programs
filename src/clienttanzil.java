import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class clienttanzil {
    public static void main(String[] args) throws Exception{
        String ip  ="192.168.43.7";
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
}
