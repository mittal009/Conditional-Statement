import java.sql.SQLOutput;
import java.util.Scanner;

public class GrossSalary
{
    public static void main(String[] args)
    {
        //initialising input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter employee ID: ");
        int ID = scanner.nextInt();           //input for employee ID
        System.out.println("Please enter employee name : ");
        String name = scanner.next();                 //input for employee name
        System.out.println("Please enter basic salary ");
        double basicSalary = scanner.nextDouble();
        double HRA = 0.10 * basicSalary;          //10% of basic salary
        double DA = 0.08 * basicSalary;             //8% of basic salary
        double TA = 0.09 * basicSalary;           //9% of basic salary
        double PF = 0.20 * basicSalary;                //20% of basic salary
        double grossSalary = basicSalary + HRA + DA + TA + PF;       //gross salary calculation
//printing calculated values of each object with total gross salary at the end
        System.out.println("HRA: " + HRA);       // print HRA value
        System.out.println("DA: " + DA);          // print DA value
        System.out.println("TA: " + TA);          // print TA value
        System.out.println("PF: " + PF);           //print PF value
        System.out.println("GrossSalary: " + grossSalary);
          //print gross salary
    }
}
