import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class cipher {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str =s.next();
        String key =s.next();
        String decriptedstr = decript(str , key);
        System.out.println(decriptedstr);
        System.out.println(encript(decriptedstr , key) );

        permutation("" ,"0123" ,decriptedstr);


    }
    public static String decript(String str , String key )
    {
        String decripted ="";
        char[] ar = new char[key.length()];
         for (int i = 0; i <key.length() ; i++) {
               ar[i]=key.charAt(i) ;
        }
      Arrays.sort(ar);
        System.out.println(ar);
        int k=0;
        String[][] arr = new String[str.length()/key.length() + 1][key.length()];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (k>str.length()-1)
                {
                    arr[i][j]="$";
                }
                else {
                    arr[i][j] = Character.toString(str.charAt(k));
                }
                k++;
            }

        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j] +  "   ");
            }
            System.out.println();
        }
        int min;
        for (int i = 0; i <key.length(); i++) {
               min=0;
            for (int j = 0; j <ar.length ; j++) {
                if (key.charAt(j)==ar[i])
                {
                    min=j;
                    break;
                }
            }
            for (int j = 0; j < (str.length()/key.length() + 1) ; j++) {
                 decripted+=arr[j][min];
            }
        }

         return decripted;
    }

    public static String encript(String str ,String key)
    {
        String  encripted="";
        int k=0;
        String[][] arr = new String[ str.length()/key.length()][key.length() ];
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 0; j <arr[i].length ; j++) {
////                if (k>str.length()-1)
////                {
////                    break;
////                }
//                arr[i][j]=Character.toString(str.charAt(k));
//                k++;
//            }

        //}

        char[] ar = new char[key.length()];
        for (int i = 0; i <key.length() ; i++) {
            ar[i]=key.charAt(i) ;
        }
        Arrays.sort(ar);
        int min;
        for (int i = 0; i <key.length(); i++) {
            min=0;
            for (int j = 0; j <ar.length ; j++) {
                if (key.charAt(j)==ar[i])
                {
                    min=j;
                    break;
                }
            }
            for (int j = 0; j < (str.length()/key.length()) ; j++) {
               arr[j][min]=Character.toString(str.charAt(k));
               k++;
            }
        }
//         for (int i = 0; i <arr.length ; i++) {
//        for (int j = 0; j <arr[i].length ; j++) {
//            System.out.print(arr[i][j] +  "   ");
//        }
//        System.out.println();
//    }

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].equals("$")) {
                    encripted += "";
                } else {
                    encripted += arr[i][j];
                }

            }
        }

        return encripted;
    }

    public static void permutation(String processed , String unprocessed ,String decriptedstr)
    {
        if(unprocessed.isEmpty())
        {

            System.out.println(encript(decriptedstr,processed));
            System.out.println();
            return ;
        }
        char ch = unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        for (int i = 0; i <=processed.length() ; i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i) ;
            permutation(first+ch+second , unprocessed ,decriptedstr) ;

        }
    }

}

// sendonemilliondollartomyaccount
//         HACK