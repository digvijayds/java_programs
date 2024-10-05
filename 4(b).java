Name-Digvijay Dattatray Sherikar
Roll No.-2052
Experiment no.-4(a)
class Rectangle
{
	int l,bh;
  Rectangle(int a, int b)
  {
	  l=a;
	  bh=b;
	  int area =l*bh;
	  System.out.println("Are of rectangle is "+area);
  }
}
class A 
{
	public static void main(String arg[])
	{
		Rectangle r1=new Rectangle(20,40);
		Rectangle r2=new Rectangle(50,60);
	}
}