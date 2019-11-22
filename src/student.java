import java.util.Scanner;

public class student {
    private String name;
    private int rollno ;
    private int mark[]=new int[3] ;

    public void studentdata()
    {
        Scanner s = new Scanner(System.in) ;
        System.out.println("enter the name of student");
        name=s.next();
        System.out.println("enter the rollno of student");
        rollno=s.nextInt();
        for (int i = 0; i <mark.length ; i++) {
            System.out.println("enter the marks of subject "+ (i+1));
            mark[i]=s.nextInt();
        }
    }
    public void showdata()
    {
        System.out.println(" the name of student    " + name );

        System.out.println(" the rollno of student  " +  rollno);
        double percentage =0 ;
        for (int i = 0; i <mark.length ; i++) {
            System.out.println("the mark of student  " + name + " in subject   " + i+1 + "       " + mark[i]);
           percentage+= mark[i];
        }
        percentage/=3;
        if (percentage>=75)
        {
            System.out.println("Grade A");
        }
        else if (percentage>=60 && percentage<75)
        {
            System.out.println("Grade B");
        }
        else if (percentage>=50 && percentage<60)
        {
            System.out.println("Grade C");
        }
        else if (percentage>=35 && percentage<50)
        {
            System.out.println("Grade D");
        }
        else
        {
            System.out.println("FAIL");
        }
    }

    public static void main(String[] args) {
        student s1[]=new student[3];
        for (int i = 0; i < 3; i++) {
            s1[i] = new student();
            s1[i].studentdata();

        }
        for (int i = 0; i < 3; i++) {
            System.out.println("the detail of student ");
            s1[i].showdata();
        }


    }
}