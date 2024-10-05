 class Rectangle {
    int in;
    int br;
    void input()
    {
        in=12;
        br=1;
    }
void area()
{
    int arg=in*br;
    System.out.println(arg);
}
public static void main(String arg[])
    {
        Rectangle r1=new Rectangle();
        r1.input();
        r1.area();
    }
}
