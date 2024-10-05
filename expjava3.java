import java.util.Scanner;
class Arithmatic
{
    public static void main(String arg[])
	{
      int a,b;
      System.out.println("Enter 2 Numbers for next oprations");
 
       Scanner sc= new Scanner(System.in);
       a=sc.nextInt();
       b=sc.nextInt();
       System.out.println("Enter your choise /n 1.Addition /n 2.Substration /n 3.Multiplication /n 4.division /n 5.Modulos");
       int ch;
       ch=sc.nextInt();
     switch(ch)
       {
  case 1 : System.out.println("Addition of Number is :"+(a+b));
           break;
  case 2 : System.out.println("Substration of Number is :"+(a-b));
           break;
  case 3 : System.out.println("Multiplication of Number is :"+(a*b));
           break;
  case 4 : System.out.println("Division of Number is :"+(a/b));
           break;
  case 5 : System.out.println("Modulos of Number is :"+(a%b));
          break;  
		 }
	}
}	