public class oop38casting {
    public static void main(String[] args) {
        int x = 10;
        double y = x;

        System.out.println(y);
        // implicit casting
        // choto theke boro kora
        // widening
        // byte —> short —> int —> long —> float —> double

        double a = 10.5;
        int b = (int) a;

        System.out.println(b);

        // explicit casting
        // boro take choto kora
        // narrowing
        // Double —>float —>long —> int —> short —> byte

    }
}
