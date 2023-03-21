import java.util.Scanner;

public class oop42exceptionproblem {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Please Enter number 1: ");
                int num1 = input.nextInt();
                System.out.print("Please Enter number 2: ");
                int num2 = input.nextInt();

                int result = num1 / num2;
                System.out.println("Result: " + num1 + "/" + num2 + "=" + result);
            } catch (Exception e) {
                System.out.println("Exception: " + e);
                System.out.println("You must enter integar. Please try again.");
            }
        }
    }
}
