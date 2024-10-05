import java.util.Scanner;
public class Arrys1 {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numberrs");

        int [][]flats=new int[2][3];
        System.out.println(flats.length);
        for(int i=0;i< flats.length;i++)
        {
            for(int j=0;j<flats[i].length;j++)
            {
                flats[i][j]=sc.nextInt();

            }
        }
    }
}
