import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class serverplayplaincypher {

    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("server started ");
        Socket soc =ss.accept();
        System.out.println("client conneected ");
        InputStreamReader in = new InputStreamReader(soc.getInputStream());
        OutputStreamWriter os = new OutputStreamWriter(soc.getOutputStream());
        PrintWriter out = new PrintWriter(os);
        BufferedReader brmsg = new BufferedReader(in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



            String encriptedword  =brmsg.readLine();
        System.out.println("Enter keys ");
            String key = br.readLine();
            System.out.println("the encripted Msg  is   : " + encriptedword);
            System.out.println("the decripted word is  " +  decripted(encriptedword , key));
        }




    public static String decripted(String enstr ,String str)
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
        String decriptd ="";
        for (int i=0;i<enstr.length()-1 ;) {
            char ch =enstr.charAt(i) ;
            char ch1=enstr.charAt(i+1);
            i+=2;


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

                decriptd+=arr[row][col1];

                decriptd+=arr[row1][col];
            }
            else if(row==row1)
            {
                decriptd+=arr[row][(col+5-1)%5];
                decriptd+=arr[row][(col1+5-1)%5];
            }
            else if(col1==col)
            {
                decriptd+=arr[(row+5-1)%5][col] ;
                decriptd+=arr[(row1+5-1)%5][col1] ;
            }

        }
        while(true)
        {
            int n = decriptd.indexOf('x' , 0);
            if (n==-1)
            {
                break;
            }
            decriptd=decriptd.substring(0,n) + decriptd.substring(n+1);
        }

        return decriptd;
    }
}
