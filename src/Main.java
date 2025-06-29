import java.util.Scanner;  // Import the Scanner class

class Main {
    // Declaration

    // First number var
    static String firstNumberStr;
    static int firstNumberInt;
    static int firstNumber;

    // Second number var
    static String secondNumberStr;
    static int secondNumberInt;
    static int secondNumber;

    // Added number var
    static int addedNumbers;

    // Create a Scanner object
    public static Scanner scannerObj = new Scanner(System.in);

    public static int collectFirstNumber(){
        while(true){
            // Prompt user
            System.out.println("Enter your first number");
            // Read user input
            firstNumberStr = scannerObj.nextLine();
            // Convert str to int
            try{
                // Convert str to int
                firstNumberInt = Integer.parseInt(firstNumberStr);
                // Return if conversion was successful
                return firstNumberInt;
            } catch (NumberFormatException e) {
                System.out.println("Needs to be a whole number.\n");
            }
        }
    }

    public static int collectSecondNumber(){
        while(true){
            // Prompt user
            System.out.println("Enter your second number");
            // Read user input
            secondNumberStr = scannerObj.nextLine();
            // Convert str to int
            try{
                // Convert str to int
                secondNumberInt = Integer.parseInt(secondNumberStr);
                // Return if conversion was successful
                return secondNumberInt;
            } catch (NumberFormatException e) {
                System.out.println("Needs to be a whole number.\n");
            }
        }
    }

    public static void main(String[] args) {

        // Collect first number
        firstNumber = collectFirstNumber();
        // Collect second number
        secondNumber = collectSecondNumber();

        // add the numbers together
        addedNumbers = firstNumber + secondNumber;

        // Display calculated numbers to console
        System.out.println(firstNumber + " + " + secondNumber + " = " + addedNumbers);

    }
}