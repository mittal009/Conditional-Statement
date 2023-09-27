import java.util.Scanner;

public class PercentageGrade
{
    public static void main(String[] args)
    {
        //initialising input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine(); //input for name
        System.out.println("Please enter your roll number: ");
        int number = scanner.nextInt();   //input for number
        System.out.println("Please enter english marks: ");
        int english = scanner.nextInt();   //input for english marks
        System.out.println("Please enter science marks: ");
        int science = scanner.nextInt();   //input for science marks
        System.out.println("Please enter economic marks: ");
        int economic = scanner.nextInt();   //input for economic marks

        double total = (english+science+economic);
        System.out.println("total: " + total);  //print total marks
        double percentage = (total/3);
        System.out.println("Percentage: " +percentage);  //print percentage value

        if (percentage>=80)
        {
            System.out.println(" PASS with Grade : A+"); // print pass with grade
        }else if (percentage>=60)
        {
            System.out.println("PASS with Grade : A");  //print pass with grade
        } else if (percentage>=50)
        {
            System.out.println("PASS with Grade : B");  // print pass with grade
        }else if (percentage>=35)
        {
            System.out.println("PASS with Grade : C"); //print pass with grade
        }else
        {
            System.out.println("FAIL");  //print fail
        }

    }
}
