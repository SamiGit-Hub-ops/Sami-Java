import java.util.Scanner;
class palindromeUsingScanner {
    public static void main(String[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if palindrome:");   
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string: " + reversed);
        
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }

}

