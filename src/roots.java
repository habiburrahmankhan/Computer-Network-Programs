import java.util.Scanner;

public class roots {
    public static void main(String args[]) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter the a ,b ,c ");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();

        roots(a,b,c);

    }
    public static void roots(int a ,int b ,int c )
    {
        float d=(b*b - 4*a*c) ;
        if (d==0)
        {
            System.out.println(" real and equal  ");
            System.out.println((float)-b/2*a + "  "+ (float)-b/2*a ) ;
        }
        else if(d>0)
        {
            float x1=(float)((-b-Math.sqrt(d))/2*a);
            float x2=(float)((-b+Math.sqrt(d))/2*a);

            System.out.println("Real and Distinct");
            System.out.println( x1+ "  "+x2) ;
        }
        else
        {
            System.out.println("imaginary");
            float x1=((float)-b/2*a);
            float x2=(float) (-Math.sqrt(-d))/2*a  ;
            System.out.println(x1 + "   " + x2+ "i");
            System.out.println(x1 + "   " + -x2+ "i");
        }
    }
}