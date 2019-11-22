import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//        int b = s.nextInt();

        // class 1
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println("hello " + i + "  " +  j );
//            }
//        }

//        int i=0;
//        while(i<3)
//        {
//            int j=0;
//            while(j<=i)
//            {
//                System.out.print("*" + " ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


        int x=0;
        if (n<2)
        {
            System.out.println("not prime");
            System.exit(0);  // to end the program
        }
        for (int i = 2; i*i<=n; i++) {
            if (n%i==0)
            {
                System.out.println("not a prime");
                x=1;
                break;
            }

        }
        if (x==0)
        {
            System.out.println("prime");
        }

     }
}
