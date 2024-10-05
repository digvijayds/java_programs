import java.util.Scanner;
class Demo_1
{
   static int a;
    static int b;
    static int c;
    public static void main(String arg[])
{
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter frist no.");
    int a=sc.nextInt();
    System.out.println("Enter secound no.");
    int b=sc.nextInt();
    c=a+b;
    System.out.println("sum of these no. is :"+c);
    if(a>b)
        System.out.println("frist no is greater than secound ");
    else if(a<b)
        System.out.println("secound no is greater than frist");
    else if(b == a)
        System.out.println("frist no. is equal to secound");


}
}