import java.util.Scanner;

public class InterchangedValue
{
    public static void main(String[] args)
    {
        //initialising input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value in a :");
        int a = scanner.nextInt();  // input to enter value for a

        System.out.println("please enter value in b :");
        int b = scanner.nextInt();    // input to enter value for b
        int c;          //created  variable
        c=a;            //assigning c=a
        a=b;             //assigning a=b
        b=c;             //assigning b=c
        System.out.println("values in a:" + a);        //print interchanged value
        System.out.println("values in b:" + b);        // print interchanged value
    }
}
