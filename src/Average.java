import java.util.Scanner;

public class Average
{
  public static void main(String[] args)
  {
      //initialising input
      Scanner scanner = new Scanner(System.in);
      System.out.println("please enter first number:");
      int number1 = scanner.nextInt();  //input to enter first number
      System.out.println("please enter second number:");
      int number2 = scanner.nextInt();  // input to enter second number
      System.out.println("please enter third number");
      int number3 = scanner.nextInt();  // input to enter third number
      System.out.println("please enter fourth number");
      int number4 = scanner.nextInt();    //input to enter fourth number
      System.out.println("please enter fifth number");
      int number5 = scanner.nextInt();    //input to enter fifth number
      {
          System.out.println("Average of five numbers is:" + (number1 + number2 + number3 + number4 + number5)/5);
          //print average of five number
      }

  }

}

