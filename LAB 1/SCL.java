import java.util.Scanner;

public class SCL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            String input = sc.nextLine();   
            int num = Integer.parseInt(input); 
            sum += num; 
        }

        System.out.println("The sum of 5 numbers is: " + sum);

        sc.close();}
}