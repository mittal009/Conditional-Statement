import java.util.Scanner;

public class NameOfTheWeek
{
    public static void main(String[] args)
    {
        //initialising input
        Scanner scanner = new Scanner(System.in);
        int a;                                    //created variable
        System.out.println("Please enter any number between 1-7: ");
        a = scanner.nextInt();     //input to enter any number between 1 -7

         //fining the day of the week by entering number with switch
        switch (a)
        {
            case 1:
                System.out.println("Monday");            //print monday for number 1
                break;
            case 2:
                System.out.println("Tuesday");             //print tuesday for number 2
                break;
            case 3:
                System.out.println("Wednesday");           //print wednesday for number 3
                break;
            case 4:
                System.out.println("Thursday");             //print thursday for number 4
                break;
            case 5:
                System.out.println("Friday");               //print friday for number 5
                break;
            case 6:
                System.out.println("Saturday");               //print saturday fir number 6
                break;
            case 7:
                System.out.println("Sunday");                     //print sunday for number 7
                break;
            default:
                System.out.println("you have entered invalid number");
              //print for invalid entry
        }
    }
}