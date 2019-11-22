import java.util.Scanner;

public class vaganesecipher {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        hrkhan();
        System.out.println("Enter the Msg to encript  : - ");
        String Msg = s.nextLine() ;
        System.out.println("Enter the Key ");
        String key =s.next() ;
        String encript= encription(Msg,key);
        System.out.println("the encryption  msg is  :- " + encript);
        System.out.println("the decryption  Msg is    " + decription(encript,key));
    }
    public static String encription(String Msg , String key) {
        String newkey = "", encript = "";
        for (int i = 0; i < Msg.length(); i++) {
            newkey += key.charAt(i % key.length());
        }
        System.out.println(newkey);


        char matrix[][] = new char[26][26];
        for (int i = 0; i <26 ; i++) {
            for (int j = 0; j < 26; j++) {
                matrix[i][j]=(char)((j+i)%26 + 'A' );
            }
        }
        for (int i = 0; i <26 ; i++) {
            for (int j = 0; j < 26; j++) {
                System.out.print(matrix[i][j] + "  ");

            }
            System.out.println();
        }
        for (int i = 0; i <Msg.length() ; i++) {
            int row = Msg.charAt(i) - 'A' ;
            int col = newkey.charAt(i) - 'A' ;
            encript+=matrix[row][col];
        }
        return encript;
    }

    public static String decription(String Msg , String key) {
        String newkey = "", decript = "";
        for (int i = 0; i < Msg.length(); i++) {
            newkey += key.charAt(i % key.length());
        }
        for (int i = 0; i <Msg.length() ; i++) {
            int row = Msg.charAt(i) - 'A' ;
            int col = newkey.charAt(i) - 'A' ;
            decript+=(char)((row-col + 26 )%26 + 'A');
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
