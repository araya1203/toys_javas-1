import java.util.Scanner;

public class MaXMins {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object

        try {
            System.out.print("Enter the first number: ");
            int num1 = myObj.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = myObj.nextInt();

            int max = Math.max(num1, num2);
            System.out.println("The maximum number is: " + max);
            
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
