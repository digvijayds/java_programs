import java.util.Scanner;
class AgeException extends Exception
{
 AgeException(String str)
 {
  super(str);
 }
}

class test
{
 void check()throws AgeException
 {
  Scanner sc=new Scanner(System.in);
  int age;
  System.out.println("Enter age of person");
  age=sc.nextInt();
  if(age<18)throw new AgeException("Invalid");
 }
}

class A
{
  public static void main(String[]args)
  {
    test obj=new test();
	try
	{
	   obj.check();
	   System.out.println("Eligible for voting");
	}
	
	catch(Exception e)
	{
	  System.out.println("EXCEPTION OCCURS");
	}
	
	finally
	{
		System.out.println("Hello");
	}	
	System.out.println("Rest of code....");
  }
}
