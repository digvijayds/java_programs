import java.util.Scanner;
public class simple {
    public static void main(String []arg)
    {
        int java,m3,coa,dms,ds;
        Scanner sc =new Scanner (System.in);
        System .out.println("enter marks of java");
        java=sc.nextInt();
        System.out.println("Enter marks of m3");
        m3=sc.nextInt();
        System.out.println("Enter marks of coa");
        coa=sc.nextInt();
        System.out.println("Enter marks of dms");
        dms=sc.nextInt();
        System.out.println("Enter marks of ds");
        ds=sc.nextInt();
        int sum=java+coa+ds+dms+m3;
        System .out.println("sum of marks is"+sum);
        float percentage;
        percentage=sum/5;
        System.out.println("percentage of student " + percentage);
        System.out.println("grade");
        if (percentage > 90)
            System.out.println("A+");
        else if (percentage < 90 && percentage >= 80)
            System.out.println("A");
        else if (percentage < 80 && percentage >= 70)
            System.out.println("B+");
        else if (percentage < 70 && percentage >= 60)
            System.out.println("b");




    }



}