import java.util.Scanner;

public class network {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        String str = s.nextLine() ;
        int key = s.nextInt();
         String sb= encripter(str,key).toString();
        System.out.println(sb);
        System.out.println(decripter(sb,key));

//        for (int i = 0; i <26 ; i++) {
//            System.out.println(decripter("KVJKGIFXIRD",i));
//        }
//        System.out.println(decripter("KVJKGIFXIRD",17));

    }

    private static StringBuilder encripter(String str, int key) {
       StringBuilder sb=new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            char ch =str.charAt(i);
            if (Character.isLowerCase(ch))
            {
                if (!Character.isLowerCase(ch + key))
                {
                    ch=(char)(ch-26);
                }
            }
            else if (Character.isUpperCase(ch))
            {
                if (!Character.isUpperCase(ch + key))
                {
                    ch=(char)(ch-26);
                }
            }
            else if (Character.isDigit(ch))
            {
                if (!Character.isDigit(ch + key))
                {
                    ch=(char)(ch-10);
                }
            }
            sb.append((char)(ch +key));
        }
        return sb;
    }

    private static StringBuilder decripter(String str, int key) {
        StringBuilder sb=new StringBuilder();

        for (int i = 0; i <str.length() ; i++) {
            char ch =str.charAt(i);
            if (Character.isLowerCase(ch))
            {
                if (!Character.isLowerCase(ch - key))
                {
                    ch=(char)(ch+26);
                }
            }
            else if (Character.isUpperCase(ch))
            {
                if (!Character.isUpperCase(ch - key))
                {
                    ch=(char)(ch+26);
                }
            }
            else if (Character.isDigit(ch))
            {
                if (!Character.isDigit(ch - key))
                {
                    ch=(char)(ch+10);
                }
            }
            sb.append((char)(ch -key));
        }
        return sb;
    }
}
