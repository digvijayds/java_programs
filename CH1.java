import java.util.Scanner;
public class CH1 {
    public static void main(String arg[])
    {
        System.out.println("Enter one number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter secound number");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
        System.out.println("enter your name");
        String str =sc.next();
        System.out.println(str);


    }
}
