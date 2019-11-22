import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.net.Socket;
import java.util.Scanner;

public class chatclientfile {
    public static void main(String[] args) throws Exception{


        Scanner s= new Scanner(System.in);

        String ip  =s.nextLine();
        int port = 8080;
        Socket soc = new Socket(ip , port);
        System.out.println(soc);

        DataInputStream din = new DataInputStream(soc.getInputStream());
        DataOutputStream dout = new DataOutputStream(soc.getOutputStream());

        File file = new File("info.txt");
        byte[]  myarray= new  byte[(int) file.length()];
        dout.write(myarray , 0 , myarray.length);
        dout.flush();
    }
}
