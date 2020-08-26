import java.util.Scanner;                    //import for Scanner functionality
                                             //Please note, the code for this application, as presented, can produce
                                             //an output screen that is identical to the one provided on canvas.
                                             //Please let me know if I should change anything in this application.
public class createApp {                     //class
    public static void main(String[] args) { //main method

        Scanner keybd = new Scanner(System.in); //creating scanner
        String name;                         //initializes value of name variable
        String pop;                          //initializes value of pop variable
        String capital;                      //initializes value of capital
        String currency;                     //initializes value of currency

        System.out.print("Hello Mom and Dad!\n\nHere are some interesting details about the country I am visiting.\n\nName: "); //greeting and prompt
        name = keybd.nextLine(); //user input for the name of their country that they are visiting
        System.out.print("\nPopulation: "); //displays population prompt
        pop = keybd.nextLine(); //user input for population
        System.out.print("\nCapital: "); //capital prompt
        capital = keybd.nextLine(); //user input for capital
        System.out.print("\nCurrency: One US Dollar equals $"); //currency prompt, String for some freedom
        currency = keybd.nextLine(); //user input for currency
        System.out.println("\n\nI'm so excited to visit the " + capital + " National Park and pet the giraffes! Talk later.");
    }
}
