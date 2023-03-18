class recursion {
    int factorial(int n) {
        // base case
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
            // calling factorial inside factorial signifies recursion.
        }
    }

public class oop16recursion {
    public static void main(String[] args) {
        recursion ob1 = new recursion();

        System.out.println("Factorial of 5 is " + ob1.factorial(5));
    }
}
