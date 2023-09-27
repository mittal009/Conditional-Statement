import java.util.Scanner;

public class EligibleToVote
{
    public static void main(String[] args)
    {
        //initialising input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age= scanner.nextInt();  //input for age

        if (age>=18)
        {
            System.out.println("you are eligible to vote");
            // print you are eligible to vote
        }else
        {
            System.out.println("you are not eligible to vote");
            // print you are not eligible to vote
        }
    }
}
