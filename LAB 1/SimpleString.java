import java.util.Scanner;

public class SimpleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = str.length();
        String rev = "";

        for (int i = count - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        boolean isPalindrome = str.equals(rev);

        System.out.println("Original String: " + str);
        System.out.println("Number of Characters: " + count);
        System.out.println("Reversed String: " + rev);
        System.out.println("Is Palindrome: " + isPalindrome);
        sc.close();
    }
}
