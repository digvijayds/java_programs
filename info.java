import java.util.Scanner;
class Person
{
	int id;
	Person()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Id of employee : ");
		id=sc.nextInt();
		
	}
}
class emp extends Person
{
	String name;
	float salary;
	emp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of employee : ");
		name=sc.next();
		System.out.println("Enter salary of employee : ");
		salary=sc.nextFloat();
	}
	void display()
	{
		System.out.println("Name"+name+"Id"+id+"Salary"+salary);
		
	}
	public static void main(String arg[])
	{
		emp e1=new emp();
		System.out.println();
		emp e2=new emp();
		System.out.println();
		emp e3=new emp();
		System.out.println();
		e1.display();
		System.out.println();
		e2.display();
		System.out.println();
		e3.display();
		
	}
}