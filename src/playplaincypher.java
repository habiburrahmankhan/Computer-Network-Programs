import  java.util.*;
public class playplaincypher {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String key = scan.next();
        String decript = encript(str , key);
        System.out.println(decript);
        System.out.println(decripted(decript , key));
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
//   cryptography