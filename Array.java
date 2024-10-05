import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int []marks=new int[3];
        marks[0]=20;
        marks[1]=30;
        marks[2]=40;
        for( int elemen:marks)
        {
            System.out.println(elemen);
        }
        String []students;
        students=new String[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of student");
        for(int i=0;i<students.length;i++)
        {
            students[i]=sc.nextLine();

        }
        System.out.println(students.length);
    }
}