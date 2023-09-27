import java.time.Year;
import java.util.Scanner;

public class LeapYear
{
   public static void main(String[] args)
   {
       //initialising input
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter any year except end of century year");
       int year = scanner.nextInt();  //input to enter year

       //if-else condition will find out weather it is a leap year or not!!
       if (year % 4 == 0)
       {
           System.out.println("YEAR " + year + " is a LEAP YEAR");
       }
        else
        {
           System.out.println("YEAR " + year + " is NOT a leap year");
       }
   }

}

