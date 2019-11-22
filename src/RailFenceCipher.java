import java.util.Scanner;

public class RailFenceCipher {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
         hrkhan();
        System.out.println("Enter the Msg to encript  : - ");
        String Msg = s.nextLine() ;
        System.out.println("Enter the Key ");
        int key =s.nextInt() ;
        String encript= encription(Msg,key);
        System.out.println("the encryption  msg is  :- " + encript);
        System.out.println("the decryption  Msg is    " + decription(encript,key));
    }



    private static String encription(String msg, int key) {
        String encript="";
        int k = 0 ;
        boolean flag = true ;
        char matrix[][] = new char[key][msg.length()] ;
        for (int i = 0; i <msg.length() ; i++) {
            matrix[k][i]=msg.charAt(i);
            if (flag)
            {
                k++;

            }
            else
            {
                k--;
            }
            if (k==0)
            {
                flag=true;
            }
            if (k==(key-1))
            {
                flag=false;
            }
        }
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]!=0)
                {
                    encript+=matrix[i][j];
                }

        }
            System.out.println();
        }

        return encript;
    }
    private static String decription(String msg, int key) {
        String decript="";
        int k = 0 ;
        boolean flag = true ;
        char matrix[][] = new char[key][msg.length()] ;
        for (int i = 0; i <msg.length() ; i++) {
            matrix[k][i]='*';
            if (flag)
            {
                k++;

            }
            else
            {
                k--;
            }
            if (k==0)
            {
                flag=true;
            }
            if (k==(key-1))
            {
                flag=false;
            }
        }
//        for (int i = 0; i <matrix.length ; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + "  ");
//            }
//            System.out.println();
//        }
        k=0;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]=='*')
                {
                    matrix[i][j] = msg.charAt(k);
                    k++;
                }

            }
        }
        k=0;
        for (int i = 0; i <msg.length() ; i++) {
            decript+=matrix[k][i];
            if (k==0)
            {
                flag=true;
            }
            if (k==(key-1))
            {
                flag=false;
            }
            if (flag)
            {
                k++;

            }
            else
            {
                k--;
            }

        }
        return decript;
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
