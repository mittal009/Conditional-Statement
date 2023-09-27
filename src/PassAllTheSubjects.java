import java.util.Scanner;

public class PassAllTheSubjects
{
    public static void main(String[] args)
    {
        //initialising input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");     //enter name here
        String name = scanner.nextLine();                       //input to enter name
        System.out.println("Please enter your roll number: ");            //enter roll number
        int number = scanner.nextInt();                                //input for roll number
        System.out.println("Please enter english marks: ");              //enter english marks
        int english = scanner.nextInt();                                  //input for english marks
        System.out.println("Please enter science marks: ");               //enter science marks
        int science = scanner.nextInt();                              //input foe science marks
        System.out.println("Please enter economic marks: ");                //enter economic marks
        int economic = scanner.nextInt();                             //input for economic marks

        //find our pass or name with if else condition
        if (economic>= 35 && english>=35 && science>=35)
        {
            System.out.println("PASS");             //print pass if pass in all subjects
        }else
        {
            System.out.println("FAIL");              //print fail when does not in all subjects
        }
    }
}
