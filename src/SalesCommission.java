import java.util.Scanner;

public class SalesCommission
{
    public static void main(String[] args)
    {
        //initialising input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter sales ID: ");                //print to enter sales ID
        int ID = scanner.nextInt();           //input for sales ID
        System.out.println("Please enter seller's name : ");             //print to enter seller's name
        String name = scanner.next();                                   //input for seller's ID
        System.out.println("Please enter sales amount: ");            //print to enter sales amount
        double amount = scanner.nextDouble();                             //input for sales amount
        System.out.println("Please enter salary : ");                   //print salary
        double salary = scanner.nextDouble();                          //input to enter salary
       //find out commission percentage using if else-if condition


        if (amount>=50000)
        {
            System.out.println("eligible for 35% commission");     //print eligible for 35% commission when salary more than 50000
        } else if (amount>=30000)
        {
            System.out.println("eligible for 20% commission");     //print eligible for 20% commission when salary more than 30000
        } else if (amount>=20000)
        {
            System.out.println("eligible for 10% commission");     //print eligible for 10% commission when salary more than 20000
        } else if (amount>=10000)
        {
            System.out.println("eligible for 5% commission");       //print eligible for 5% commission when salary more than 10000
        }else
        {
            System.out.println("eligible for 2% commission");     //print eligible for 2% commission when salary less than 10000
        }
    }
}
