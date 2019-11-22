import java.util.Scanner;

public class ceasercipher {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        hrkhan();
        System.out.println("Enter the Msg to encript  : - ");
        String Msg = s.nextLine() ;
        System.out.println("Enter the Key ");
            int key =s.nextInt() ;
            String encript= encription(Msg,key);
            System.out.println("the encripted msg is  :- " + encript);
            System.out.println("the decrited Msg is    " + decription(encript,key));
        }


        public  static String encription(String Msg , int key)
    {
        String encript = "";
        for (int i = 0; i <Msg.length() ; i++) {
            char ch = Msg.charAt(i);
            if (Character.isUpperCase(ch))
            {
                encript+=(char)((ch + key - 'A' )%26 + 'A' );
            }
            else if (Character.isLowerCase(ch))
            {
                encript+=(char)((ch + key -'a')%26 + 'a' ) ;
            }
            else if(Character.isDigit(ch))
            {
                encript+=(char)((ch + key - '0')%10 + '0' ) ;
            }
            else
            {
                encript+=ch ;
            }
        }

        return encript;
    }

    public  static String decription(String Msg , int key)
    {
        String decript = "";
        for (int i = 0; i <Msg.length() ; i++) {
            char ch = Msg.charAt(i);
            if (Character.isUpperCase(ch))
            {
                decript+=(char)((ch - key - 'A' + 26)%26 + 'A' );
            }
            else if (Character.isLowerCase(ch))
            {
                decript+=(char)((ch - key -'a' + 26)%26 + 'a' ) ;
            }
            else if(Character.isDigit(ch))
            {
                decript+=(char)((ch - key - '0' + 30 )%10 + '0' ) ;
            }
            else
            {
                decript+=ch ;
            }
        }

        return decript;
    }
    public static void hrkhan()
    {
        System.out.println("Name : - Habiburrahman");
        System.out.println("Roll no :- 17BCS071 ");
        System.out.println("B-Tech 5th Semester ");
        System.out.println();
    }

}

 //    mycomputer 3
//    pbfrpsxwhu
//            mycomputer