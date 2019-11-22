import java.util.Scanner;

public class hillcypher {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in) ;
             hrkhan();
            System.out.println("Enter the Msg to encript  : - ");
            String Msg = s.nextLine() ;
            System.out.println("Enter the Key ");
            int mat[][] = new int[3][3] ;
            for (int i = 0; i <3 ; i++) {
                for (int j = 0; j < 3; j++) {
                    mat[i][j]=s.nextInt();
                }
            }
            String encript= encription(Msg,mat);
            System.out.println("the encripted msg is  :- " + encript);
          //  System.out.println("the decrited Msg is    " + decription(encript,mat));
        }



    private static String encription(String msg, int[][] mat) {
            String encript="" ,newmsg=msg;
            if (msg.length()%3!=0)
            {
                int m = msg.length()%3;
                while(m==0)
                {
                    newmsg+='x';
                    m--;
                }
            }
            int matmsg[][] = new int[3][1];
            int matfinal[][] = new int[3][1];
        for (int i = 0; i <newmsg.length()-2 ; i+=3) {
               matmsg[0][0] = (int)(newmsg.charAt(i) - 'A' );
               matmsg[1][0] = (int)(newmsg.charAt(i+1) - 'A') ;
               matmsg[2][0] = (int)(newmsg.charAt(i+2) - 'A');
            for (int j = 0; j < 3 ; j++) {
                for (int k = 0; k < 1; k++) {
                    for (int l = 0; l < 3  ; l++) {
                        matfinal[j][k]+=matmsg[l][k]*mat[j][l];
                    }
                }
            }
            for (int j = 0; j <3 ; j++) {
                encript+=(char)(matfinal[j][0]%26 + 'A') ;
            }


        }

        return encript ;
    }
    public static void hrkhan()
    {
        System.out.println();
        System.out.println("Name : - Habiburrahman");
        System.out.println("Roll no :- 17BCS071 ");
        System.out.println("B-Tech 5th Semester ");
        System.out.println();
    }
//    private static String decription(String encript, int[][] mat) {
//
//    }






}


//6 24 1 13 16 10 20 17 15