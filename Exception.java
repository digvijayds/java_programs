
public class Exception extends Throwable {
    public static void main(String arg[]){

        try{
            int a=100/0;

        }

        catch(ArithmeticException e){
            System.out.println("Error");
        }

    }
}
