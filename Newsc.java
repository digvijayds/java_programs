import java.util.Scanner;
public class Newsc {
    public static void main(String args[])
    {
        System.out.println("enter 1st no. to add");
        Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();
        System.out.println("enter 2nd no. to add");
        int n2=sc.nextInt();
        int n3=n1+n2;
        System.out.println("the answer is\n"+n3);


    }
}
