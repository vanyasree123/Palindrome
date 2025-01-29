import java.util.Scanner;

public class Palindromecheck{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the string to lower case and remove non-alphanumeric characters
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the string is a palindrome
        if (isPalindrome(cleanInput)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }

    // Method to check if a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}