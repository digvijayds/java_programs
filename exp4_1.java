class Box
{
 int l,bh,h;
 Box()
 {
 l=20;
 bh=30;
 h=40;
 }
 Box(int a,int b, int c)
 {
 l=a;
 bh=b;
 h=c;
 }
 void display()
 {
 int vol=l*bh*h;
 System.out.println("volme of box is : "+vol);
 }
 }
 class Box1
 {
 public static void main(String arg[])
 {
 Box b1=new Box();
 b1.display();
  Box b2=new Box(20,90,50);
 b2.display();
 
 }
 }