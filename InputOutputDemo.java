import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for integer
        System.out.print("Enter an integer: ");
        int userInt = input.nextInt();

        // Prompt for decimal number
        System.out.print("Enter a decimal number: ");
        double userDouble = input.nextDouble();
        
        input.nextLine(); // Consume newline left-over

        // Prompt for string input
        System.out.print("Enter a word or sentence: ");
        String userString = input.nextLine();

        // Output results
        System.out.printf("Your integer: %d%n", userInt);
        System.out.printf("Your decimal number: %.2f%n", userDouble);
        System.out.printf("Your string: %s%n", userString);

        input.close(); // Close scanner
    }
}
