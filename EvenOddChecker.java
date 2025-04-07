import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {
        // Get the integer input from the user
        int number = getIntegerInput();

        // Determine if the number is even or odd and display the result
        String result = checkEvenOrOdd(number);
        System.out.println(result);
    }

    // Method to get an integer input from the user
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Enter an integer: ");
        // Validate the input to ensure it's an integer
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next(); // Consume the invalid input
            System.out.print("Enter an integer: ");
        }

        number = scanner.nextInt();
        return number;
    }

    // Method to check if the number is even or odd
    public static String checkEvenOrOdd(int number) {
        // Use modulo operator to check if the number is divisible by 2
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }
}
