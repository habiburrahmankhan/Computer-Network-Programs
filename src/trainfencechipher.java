import java.util.Arrays;
import java.util.Scanner;

public class trainfencechipher {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int n = s.nextInt();
        String decript = decription(str,n);
        System.out.println(" the decripted word is "  + decript );
        String encript = encription(str ,n);
        System.out.println(" the encripted word is "  + encript);
    }
    public static String decription(String str ,int n)
    {
        String decripted="";


//        for (int i = 0; i <ch.length ; i++) {
//            for (int j = 0; j <ch[i].length ; j++) {
//                System.out.print(ch[i][j] + " ");
//            }
//            System.out.println();
//            }

        return decripted ;
    }
    public static String encription(String str ,int n)
    {

       String encripted="";
        char ch[][] = new char[n][str.length()];
        int m=n;
            int i=0;
            while (i<str.length())
            {
            int j=0;
                     while(j<n) {
                         ch[j][i] = str.charAt(i);
                         j++;
                         i++;
                     }
                      j--;
                     while (j>0)
                     {
                         ch[j][i] = str.charAt(i);
                         j++;
                         i++;

                     }


        }
        for (int j = 0; j < n; j++) {
            for (int k = 0; k <str.length() ; k++) {
                System.out.print(ch[i][j]);
            }
            System.out.println();
        }

        return encripted ;
    }
}
