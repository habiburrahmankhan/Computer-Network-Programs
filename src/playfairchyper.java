import java.util.Scanner;

public class playfairchyper {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine().toLowerCase();
        int n=s.nextInt();
        int mat[][] = new int[n][n] ;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j]=s.nextInt();
            }
        }
        checkInverse(mat);
        System.out.println( "the encripted msg     " +  encript(str , mat) );
    }
    public static String encript(String str , int mat[][])
    {
        String encript="" ;
        String spacestring ="" ;
        int b[][] = new int[2][1] ;
        int c[][] = new int[2][1] ;
        for (int i = 0; i <str.length();i++) {
            if (Character.isAlphabetic(str.charAt(i)))
            {
                spacestring+=str.charAt(i);
            }
        }
        if (spacestring.length()%2!=0)
        {
            spacestring+="X" ;
        }
        System.out.println(spacestring);

        for (int i = 0; i <spacestring.length()-2; i+=2) {
            int ch1=spacestring.charAt(i) - 'a';
            int ch2 = spacestring.charAt(i+1) - 'a';
            b[0][0] = ch1;
            b[1][0] = ch2 ;
            for (int j = 0; j < 2 ; j++) {
                for (int k = 0; k <1 ; k++) {
                    for (int l = 0; l <2 ; l++) {
                        c[j][k]+= mat[j][l]*b[l][k] ;
                    }
                }
            }

            for (int k = 0; k <2 ; k++) {
                for (int j = 0; j < 1; j++) {
                    encript+= (char)(c[k][j]%26 + 'a') ;
                }

            }


        }
        return encript ;
    }

    public static boolean checkInverse(int[][] mat)
    {
        int determinant = 0;
            determinant = determinant + ((mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0]));

        System.out.println("\n\n\n determinet  " +  determinant);


        for(int i = 0; i < 2; i++){
            for(int j = 0; j <2; j++) {
                System.out.print(((mat[(j + 1) % mat.length][(i + 1) % mat.length] * mat[(j + 2) % mat.length][(i + 2) % mat.length]) - (mat[(j + 1) % mat.length][(i + 2) % mat.length] * mat[(j + 2) % mat.length][(i + 1) % mat.length])) / determinant + "        ");
            }
            System.out.println();
        }



        return true ;
    }


}



//    attack at down
//        2
//        5 8 17 3
//

//  attack at down