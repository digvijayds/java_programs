 class Area {
    int in;
    int br;
    void input (int l,int b)
    {
        in=l;
        br=b;
    }
    void area()
    {
        int ar=in*br;
        System.out.println(ar);
    }
    public static void main(String arg[])
        {
            Area r1=new Area();
            Area r2=new Area();
            r1.input(20,10);
            r1.area();
            r2.input(23,59);
            r2.area();


        }
}
