import java.net.*;
import java.util.Scanner;
import java.io.*;

/**
 * SocketFileClient
 * 
 * java SocketFileClient <ip address> <port>
 */
public class SocketFileClient {

    public final static String FILE_TO_RECEIVE = "./sample_file2.txt";

    public static void main(String[] args) throws FileNotFoundException {
        hrkhan();
        Scanner kin = new Scanner(System.in);
        String message;
        String serverName =kin.nextLine();
        int port = kin.nextInt();

        byte[] file_recieved = new byte[3084959];
        FileOutputStream fos = new FileOutputStream(FILE_TO_RECEIVE);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int readBytes = 0;

        try {
            Socket client = new Socket(serverName, port);
            System.out.println("Connecting to " + serverName + " at port " + port);

            System.out.println("Connected to server " + serverName);

            OutputStream outputToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outputToServer);
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);

            int fileSize = Integer.parseInt(in.readUTF());
            System.out.println("File size = " + fileSize);
            while (true) {
                // recieve file byte by byte
                for (int i = 0; i < fileSize; i++) {
                    file_recieved[i] = in.readByte();
                  //  System.out.println(i);
                }

                // write to file
                bos.write(file_recieved, 0, fileSize);
                bos.flush();

                System.out.println("FILE RECIEVED SIZE = " + fileSize);
                break;

            }
            // client.close();
            // kin.close();
        } catch (Exception e) {
            System.out.println("FILE READ ERROR----------------");
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