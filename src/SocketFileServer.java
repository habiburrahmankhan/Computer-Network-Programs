import java.io.*;
import java.net.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * SocketFileServer
 * 
 * terminal command java SocketFileServer <port> <ip address>
 */
public class SocketFileServer {

    public final static String FILE_TO_SEND = "/Users/habiburrahmankhan/Desktop/oops/src/sample_file.txt"; // address to file

    public static void main(String[] args) throws IOException {
        hrkhan();
        Scanner  s = new Scanner(System.in);
        InetAddress ip = InetAddress.getByName(s.nextLine());
        int port =s.nextInt();
        ServerSocket serverSocket = new ServerSocket(port, 0, ip);
        System.out.println("Waiting for client on " + serverSocket.getLocalPort() + serverSocket.getInetAddress());
        Socket server = serverSocket.accept();
        System.out.println("Connected to : " + server.getRemoteSocketAddress());
        DataInputStream in = new DataInputStream(server.getInputStream());
        DataOutputStream out = new DataOutputStream(server.getOutputStream());

        File myFile = new File(FILE_TO_SEND);
        byte[] file_byte_array = new byte[(int) myFile.length()];

        FileInputStream fis = new FileInputStream(myFile);
        BufferedInputStream bis = new BufferedInputStream(fis);
        bis.read(file_byte_array, 0, file_byte_array.length);

        while (true) {

            out.writeUTF(""+file_byte_array.length);

            try {

                System.out.println("Sending file in 3 seconds \n");

                for (int i = 0; i < 3; i++) {
                    System.out.println(".\n");
                    Thread.sleep(1000);
                }

                System.out.println("Tranferring now bytes = "+file_byte_array.length);

                // tranfer file byte by byte
                for (int i = 0; i < file_byte_array.length; i++) {
                    out.writeByte(file_byte_array[i]);
                }

                break;

                // server.close();

            } catch (SocketTimeoutException e) {
                System.out.println("Server timed out");
            } catch (EOFException e) {
                server.close();
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
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