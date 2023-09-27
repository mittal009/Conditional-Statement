import java.util.Scanner;

public class PositiveNegativeZero
{
   public static void main(String[] args)
   {
       //initialising input
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter any number");
       int number = scanner.nextInt();     //input to enter number

       if (number> 0)
       {
           System.out.println(number + " is positive number.");  //print if number is positive
       } else if (number< 0)
       {
           System.out.println(number + " is negative number");    // print if number is negative
       } else
       {
           System.out.println(number + " is ZERO");   //print if number is zero
       }
   }
}
