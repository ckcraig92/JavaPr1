import java.util.Scanner;  // Import the Scanner class

public class Main {

    public static void main(String[] args)
    {
        //System.out.println("Hello world");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input

        //prompt user input year of birth

        System.out.println("what is your year of birth?");
        
        int year = myObj.nextInt();

        int age = 2025 -year;
        System.out.println("you are " + age  + " years old");

        String decimal = "3.45";
        String integer = "4567";
        double double1 = Double.parseDouble(decimal); //convert to double

        int int1 = Integer.parseInt(decimal); //convert to int

        System.out.println("double number" +double1);
        System.out.println("int number " +int1);


    }
}