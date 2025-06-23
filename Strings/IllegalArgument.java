import java.util.*;

public class IllegalArgument {
    // Method to generate IllegalArgumentException (not used in main)
    public static void generateException(String input) {
        // This will cause StringIndexOutOfBoundsException, not IllegalArgumentException
        String result = input.substring(5, 2);
        System.out.println("Substring: " + result);
    }

    // Method to handle exception
    public static void handleException(String input) {
        try {
            String result = input.substring(5, 2);
            System.out.println("Handled Exception: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        handleException(input);
        sc.close();
    }
}
