import java.util.*;
class Box 

{
   int l,b,h;
  Box(int a, int d, int c )
  {
     l=a;
     b=d;
     h=c;	 
  }
  void volume()
  {
   int vol=l*b*h;
   System.out.println("volume of box "+vol);
  }

}
class box1
{
   public static void main(String arg [])
   {
   Scanner sc = new Scanner (System.in);
   System.out.println("Enter length, bredth and height of frist box ");
   int x=sc.nextInt();
   int y=sc.nextInt();
   int z=sc.nextInt();
    Box b1 =new Box(x,y,z);
	b1.volume();
   System.out.println("Enter length, bredth and height of secound box ");
   int k=sc.nextInt();
   int g=sc.nextInt();
   int q=sc.nextInt();
    Box b2 =new Box(k,g,q);
	b2.volume();
	
	
   }
}