import java.util.Scanner;

public class PrintCityName
{
    public static void main(String[] args)
    {
   //initialising objects
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any alphabet from a to f : ");
       char letter = scanner.next().charAt(0);              //input to enter alphabet

        //print name of city accordingly to its alphabet number entered with switch method
        switch (letter)
        {
            case 'a':
                System.out.println("Acton");                       //print city name starts with a
                break;
            case 'b':
                System.out.println("Birmingham");                   //print city name starts with b
                break;
            case 'c' :
                System.out.println("Cambridge");                     //print city name starts with c
                break;
            case 'd' :
                System.out.println("Durham");                         //print city name starts with d
                break;
            case 'e' :
                System.out.println("Epsom");                          //print city name starts with e
                break;
            case 'f' :
                System.out.println("Farnham");                      // print city name starts with f
                break;
            default:
                System.out.println("invalid entry");                  //print invalid entry
        }
    }
}
