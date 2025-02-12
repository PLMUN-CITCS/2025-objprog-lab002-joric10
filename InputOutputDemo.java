import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt and read integer input
        System.out.print("Enter an integer: ");
        int userInt = input.nextInt();

        // Prompt and read double input
        System.out.print("Enter a decimal number: ");
        double userDouble = input.nextDouble();
        input.nextLine(); // Consume newline left by nextDouble()

        // Prompt and read string input
        System.out.print("Enter a word or sentence: ");
        String userString = input.nextLine();

        // Display the inputs
        System.out.printf("Your integer: %d%n", userInt);
        System.out.printf("Your decimal number: %.2f%n", userDouble);
        System.out.printf("Your string: %s%n", userString);

        // Close the scanner
        input.close();
    }
}
