import java.util.Scanner;
public class Year {
    public static void main(String []arg)
    {
        System.out.println("enter year");
        Scanner sc=new Scanner(System.in);
                int yr=sc.nextInt();
        if(yr%4==0)
            System.out.println("it is leap year");
    }
}
