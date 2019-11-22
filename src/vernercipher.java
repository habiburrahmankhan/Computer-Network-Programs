import java.util.Scanner;

public class vernercipher {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
         hrkhan();
        System.out.println("Enter the Msg to encript   ");
        String Msg = s.nextLine() ;
        String key = getkey(Msg.length());
        System.out.println("Random key generated and  the Key is  " + key);
        String encript= encription(Msg,key);
        System.out.println("the encryption msg is   " + encript);
        System.out.println("the decryption Msg is    " + decription(encript,key));
    }


    private static String getkey(int length) {
        String key="";
        for (int i = 0; i < length; i++) {
            int m = (int)(Math.random()*(26 -1));
           key+=(char)(m + 'A');
        }
        return key;
    }

    private static String encription(String msg, String key) {
        String encript="";
        for (int i = 0; i <msg.length(); i++) {
            int m = ((msg.charAt(i)- 'A') + (key.charAt(i) -'A'));
            encript+=(char)(m%26 + 'A');
        }
        return encript;
    }
    private static String decription(String encript, String key) {
        String decript="";
        for (int i = 0; i <encript.length() ; i++) {
            int m = ((encript.charAt(i)- 'A') - (key.charAt(i) -'A') + 26);
            decript+=(char)(m%26 + 'A');
        }
        return decript ;
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
