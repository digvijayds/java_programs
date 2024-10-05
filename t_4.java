abstract class Animal
{
	abstract void cats();
	abstract void dogs();
}
abstract class Cats extends Animal
{
	void cats()
	{
		System.out.println("Cats meow");
	}
}
abstract class Dogs extends Cats
{
	void dogs()
	{
		System.out.println("Dogs Bark");
	}
}
class A extends Dogs
{
	public static void main(String arg[])
	{
		A c=new A();
		c.cats();
		A d=new A();
		d.dogs();
		
	}
}
