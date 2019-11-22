import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;

public class clientplayplaincypher {

    public static void main(String[] args) throws Exception {
        String ip = "localhost";
        int port = 9999;
        Socket soc = new Socket(ip, port);

        OutputStreamWriter os = new OutputStreamWriter(soc.getOutputStream());
        InputStreamReader in = new InputStreamReader(soc.getInputStream());
        PrintWriter out = new PrintWriter(os);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader brmsg = new BufferedReader(in);
        System.out.println("Enter string and key ");
        String str = br.readLine();
        String key = br.readLine();


        out.println(encript(str, key));
        os.flush();

    }

    public static String encript(String enstr ,String str)
    {
        HashMap<Character , Integer > map = new HashMap<>();
        char arr[][] = new char[5][5] ;
        int k=0 , a=0;
        for (int i=0;i<5 ;i++) {
            for (int j=0;j<5 ;) {
                if (k<str.length()) {
                    if(!map.containsKey(str.charAt(k)))
                    {
                        arr[i][j]=str.charAt(k);
                        map.put(str.charAt(k) ,1);
                        j++;
                    }
                }
                else
                {
                    if((!map.containsKey((char)(a+'a'))) && (char)(a+'a')!='j')
                    {
                        arr[i][j]=(char)(a+'a');
                        map.put((char)(a+'a'),1);
                        j++;
                    }
                    a++;
                }
                k++;
            }

        }
        for (int i=0;i<5 ;i++ ) {
            for (int j=0;j<5 ;j++ ) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
        String encriptd ="";
        for (int i=0;i<enstr.length()-1 ;) {
            char ch =enstr.charAt(i) ;
            char ch1=enstr.charAt(i+1);
            if (ch!=ch1) {
                i+=2;
            }
            else
            {
                ch1='x';
                i++;
            }
            int row = 0, col=0 , row1=0 , col1=0 ;
            for (int j=0;j<5 ;j++ ) {
                for ( k=0;k<5 ;k++ ) {
                    if (ch==arr[j][k]) {
                        row =j;
                        col =k;
                    }
                    if (ch1==arr[j][k]) {
                        row1=j;
                        col1=k;
                    }
                }
            }

            if((row!=row1) && (col1!=col))
            {

                encriptd+=arr[row][col1];

                encriptd+=arr[row1][col];
            }
            else if(row==row1)
            {
                encriptd+=arr[row][(col+1)%5];
                encriptd+=arr[row][(col1+1)%5];
            }
            else if(col1==col)
            {
                encriptd+=arr[(row+1)%5][col] ;
                encriptd+=arr[(row1+1)%5][col1] ;
            }

        }
        return encriptd;
    }
}
