import java.util.Scanner;
class Voting
{
 public static void main(String arg[])
 {
  int age;
  System.out.println("Enter age");
  Scanner sc =new Scanner (System.in);
  age=sc.nextInt();
  if(age>18)
  {
   System.out.println("you ara eligible for voting ");
   }
   else
   {System.out.println("You are not eligible for voting ");
   }
   }
 }  