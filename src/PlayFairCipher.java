import java.util.HashMap;
import java.util.Scanner;

public class PlayFairCipher {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
         hrkhan();
        System.out.println("Enter the Msg to encript  : - ");
        String Msg = s.nextLine().toUpperCase() ;
        System.out.println("Enter the Key ");
        String key =s.next().toUpperCase() ;
        String encript= encription(Msg,key);
        System.out.println("the encryption  msg is  :- " + encript);
        System.out.println("the decryption  Msg is    " + decription(encript,key));
    }
    private static char[][] matrixgeneration(String key)
    {
        HashMap<Character , Integer> map = new HashMap<>();
        int k =0 , charalpha = 0 ;
        char matrix[][] = new char[5][5] ;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ;) {
                if (k<key.length())
                {
                    if (!map.containsKey(key.charAt(k))) {
                        matrix[i][j] = key.charAt(k);
                        map.put(key.charAt(k) , 1);
                        j++ ;
                    }
                }
                else
                {
                    if (!map.containsKey((char)('A'+charalpha)) && ('A' + charalpha)!='J')
                    {
                        matrix[i][j]=(char)('A'+charalpha) ;
                        j++;
                        map.put((char)('A'+charalpha),1);
                    }
                    charalpha++;
                }
                k++;
            }
        }
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
        return matrix ;

    }
    private static String encription(String msg, String key) {

       char[][] matrix = matrixgeneration(key);
        String encript="";
        //Algo
        String newMsg =msg;
        for (int i = 0; i <msg.length()-1 ; i++) {
            if (msg.charAt(i)==msg.charAt(i+1))
            {
                newMsg=newMsg.substring(0,i+1) + 'X' + newMsg.substring(i+1);
            }
        }
        if (newMsg.length()%2!=0)
        {
            newMsg+='X';
        }
       // System.out.println(newMsg);
        for (int i = 0; i <newMsg.length()-1;i+=2) {
            char ch1 =newMsg.charAt(i);
            char ch2 =newMsg.charAt(i+1);
            int row1=0,row2=0,col1=0 ,col2=0;
            for (int j = 0; j <matrix.length ; j++) {
                for (int l = 0; l <matrix[j].length ; l++) {
                    if (matrix[j][l]==ch1)
                    {
                        row1=j;
                        col1=l;
                    }
                    if (ch2==matrix[j][l])
                    {
                        row2=j;
                        col2=l;
                    }
                }
            }
            if (row1==row2)
            {
                encript+=matrix[row1][(col1+1)%5] +""+ matrix[row1][(col2+1)%5] ;
            }
            else if(col1==col2)
            {
                encript+=matrix[(row1 + 1)%5][col1] +""+ matrix[(row2+1)%5][col2] ;
            }
            else
            {
                encript+=matrix[row1][col2] +""+ matrix[row2][col1] ;
            }
        }
        return  encript ;
    }
    private static String decription(String msg, String key) {
        String decript="";
        char[][] matrix = matrixgeneration(key);
        //Algo
        for (int i = 0; i <msg.length()-1;i+=2) {
            char ch1 =msg.charAt(i);
            char ch2 =msg.charAt(i+1);
            int row1=0,row2=0,col1=0 ,col2=0;
            for (int j = 0; j <matrix.length ; j++) {
                for (int l = 0; l <matrix[j].length ; l++) {
                    if (matrix[j][l]==ch1)
                    {
                        row1=j;
                        col1=l;
                    }
                    if (ch2==matrix[j][l])
                    {
                        row2=j;
                        col2=l;
                    }
                }
            }
            if (row1==row2)
            {
                decript+=matrix[row1][(col1-1 + 5)%5] +""+ matrix[row1][(col2-1 + 5)%5] ;
            }
            else if(col1==col2)
            {
                decript+=matrix[(row1 - 1+ 5)%5][col1] +""+ matrix[(row2-1 + 5)%5][col2] ;
            }
            else
            {
                decript+=matrix[row1][col2] +""+ matrix[row2][col1] ;
            }
        }

        while(true)
        {
            int n = decript.indexOf('X' , 0);
            if (n==-1)
            {
                break;
            }
            decript=decript.substring(0,n) + decript.substring(n+1);
        }
        return  decript ;
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
