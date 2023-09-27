import java.util.Scanner;

public class EnterSymbol
{
    public static void main(String[] args)
    {
        // Initializing input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any two number one after other : ");
        int a = scanner.nextInt(); //enter first value
        int b = scanner.nextInt();  //enter second value
        System.out.println("enter a symbol you want to calculate(+,-,/,*)");
        char op = scanner.next().charAt(0);  //to accept the char input

        switch (op)
        {
            case '+':
                System.out.println(a+b);  //printing the addition value
                break;
            case '-':
                System.out.println(a-b);    //printing the sub value
                break;
            case '/':
                System.out.println(a/b);        //printing the division value
                break;
            case '*':
                System.out.println(a*b);       //printing the multiplication value
                break;
            default:
                System.out.println("invalid input");  //printing default if entered wrong value
        }
    }
}
