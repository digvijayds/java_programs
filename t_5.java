abstract class Shape
{
	abstract void RectangleArea(int x,int y);
	abstract void SquareArea(int z);
	abstract void CircleArea(int w);
}
class Area extends Shape
{
	int a,b;
	void RectangleArea(int a,int b)
	{
		int area =a*b;
		System.out.println("Area of Rectangle is "+area);
	}
	void SquareArea(int a) 
	{
		 int area=a*a;
		 System.out.println("Area of Square is "+area);
	}
	void CircleArea(int a)
	{
		double area=3.14*a*a;
		System.out.println("Area of Circle is "+area);
	}
}
class A extends Area
{
	public static void main(String arg[])
	{
		Area a1=new Area();
		a1.RectangleArea(4,2);
		a1.SquareArea(5);
		a1.CircleArea(7);
	}
}