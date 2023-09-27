import java.util.Scanner;

public class VowelConsonant
{
    public static void main(String[] args)
    {
        // initialising input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a single alphabet: ");
        char ch = scanner.next().charAt(0);             //input syntax to enter single alphabet

        // finding entered alphabet is vowel or consonant using if else
        if (ch== 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
        {
            System.out.println(ch + " is vowel");        //print alphabet entered is vowel

        } else
        {
            System.out.println(ch + " is consonant");          //print alphabet entered is consonant
        }
    }
}
