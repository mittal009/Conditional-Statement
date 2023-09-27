import java.util.Scanner;

public class UppercaseIntoLowercase
{
    public static void main(String[] args)
    {
        //initialising  input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any alphabet in UPPERCASE");
        String text = scanner.next();           //input to type alphabet in uppercase

        {
            System.out.println(text.toLowerCase());        //print entered alphabet in lowercase
        }

    }

}
