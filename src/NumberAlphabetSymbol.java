import java.util.Scanner;

public class NumberAlphabetSymbol
{
   public static void main(String[] args)
   {
       // initialising input
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter any character");
       char ch = scanner.next().charAt(0);   //any character
      //check whether value added is alphabet/number/symbol
       if (Character.isAlphabetic(ch))
       {
           System.out.println(ch + " is an alphabet.");   //print if its alphabet
       }  else if (ch>= '0' && ch <= '9')
         {
           System.out.println(ch + " is a number.");  //print it its number
         }  else
          {
              System.out.println(ch + " is a symbol.");  //print if its symbol
          }

   }
}
