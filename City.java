import java.util.Scanner;
public class City {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String city;
        System.out.println("Enter city name and see ");
        city=sc.next();

        if(city == "Meerut") {
            System.out.println("city is meerut");
        }else if (city == "Noida") {
            System.out.println("city is noida");
        }else if(city == "Agra") {
            System.out.println("city is agra");
        }else {
            System.out.println(city);
        }
    }
}
