import java.util.Scanner;
abstract  class name
{
    abstract void call();
    void roahan()
    {
        System.out.println("rohan");
    }

}
class newname extends name
{
    String name;
    Scanner sc=new Scanner(System.in);

    void call()
    {
        super.roahan();
        System.out.println("Enter name of person");
        name=sc.nextLine();
    }
}

public class cwh_abststract extends newname {
    public static void main(String arg[])
    {
        newname a=new newname();
        a.call();
    }
}
