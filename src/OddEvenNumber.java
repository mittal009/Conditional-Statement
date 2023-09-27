import java.util.Scanner;

public class OddEvenNumber
{
  public static void main(String[] args)
  {
    //initialising input

    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter any two digit number");
    int number = scanner.nextInt();                    //input for number
    String result = (number%2==0) ? "EVEN" : "ODD";     // syntax for ternary operator

    // ternary operator checks here if the number is odd number or even number

    System.out.println("The number you have entered is " + result + " number");
  }

}






