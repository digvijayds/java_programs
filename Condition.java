public class Condition {
    int li,br,hi;
    int volume(int a, int b, int c)
    {
        li=a;
        br=b;
        hi=c;
        int vol=li*br*hi;
        System.out.println(vol);
        return vol;
    }
    public static void main(String arg[])
    {
        Condition c1=new Condition();
        c1.volume(20,30,40);
        System.out.println("volume of frist box"+c1);
        Condition c2=new Condition();
        c2.volume(10,20,30);
        System.out.println("volume of secound box"+c2);
    }
}