class demo
{
    public static void main(String arg[])
    {
        try {
            int c=10/0;

        } catch (Exception e) {
            System.out.println("error occurs");
            // TODO: handle exception
        }
        finally{
            System.out.println("hello");
        }
    }
}