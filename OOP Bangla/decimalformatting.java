import java.text.DecimalFormat;

public class decimalformatting {
    public static void main(String[] args) {

        // using C style
        double x = 3.1416512;
        System.out.printf("X = %.2f", x);
        System.out.println();
        System.out.printf("X = %.4f", x);

        // java style
        DecimalFormat ob = new DecimalFormat("0.00");
        double y = 3.1416512;
        System.out.println();
        System.out.println("Y: " + ob.format(y));
    }
}
