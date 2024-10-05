abstract class Abstract
{
	Abstract()
	{
		System.out.println("This is constructor of abstract class ");
	}
	abstract void a_method();
	void non_abstract()
	{
		System.out.println("This is normal method of abstract class");
	}
}
class subClass extends Abstract
{
	void a_method()
	{
		System.out.println("This is abstract method");
	}
}
class A
{
	public static void main(String arg[])
	{
		subClass s1=new subClass();
		s1.non_abstract();
		s1.a_method();
	}
}