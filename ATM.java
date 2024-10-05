import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class ATM {
     static int balance=10000;
   static void withdrawals(int a)
    {

        if(balance>a)
        {
            balance=balance-a;
            System.out.println("available balance is : "+balance);
        }

    }
    static void deposit(int a){

       balance=balance+a;
       System.out.println("Available balanced is "+balance);
    }
    static int p= 3404;

    public static void main(String arg[])
    {



        int pass;
        System.out.println("Enter your password");

        Scanner sc=new Scanner(System.in);

                pass=sc.nextInt();
        if(p==pass) {


            System.out.println("Select your services from below:");


            System.out.println("1.Cash withdrawals");
            System.out.println("2.Balance inquiry");
            System.out.println("3.Cash deposit");
            System.out.println("4.Other");




                int choice;
                choice=sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter amount ");
                        int ramdom;
                        ramdom = sc.nextInt();
                        withdrawals(ramdom);
                        break;
                    case 2:
                        System.out.println(" " + balance);
                        break;
                    case 3:
                        System.out.println("Enter your amount ");
                        int a;
                        a = sc.nextInt();
                        deposit(a);
                        break;
                    case 4:
                    default:
                }

        }
        else{
            System.out.println("you have intered wrong pass word");
        }

    }

}
