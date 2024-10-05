import java.util.Scanner;
class A
{
    public static void main(String arg[])
	{
	 int a=0;
	 int b=1;
	 int c,i;
	 System.out.println("Enter a Number ");
	 Scanner sc =new Scanner(System.in);
	 int n=sc.nextInt();
	 System.out.print(a+" "+b);
	 for(i=2;i<=n;++i)
	   {
	   c=a+b;
	   System.out.print(" "+c);
	   a=b;
	   b=c;
	   }
	}
}	