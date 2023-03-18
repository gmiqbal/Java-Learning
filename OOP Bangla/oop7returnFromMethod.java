class returingvalue {

    // method
    int square(int value) {
        return value * value;

    }
}

// public class oop7returnFromMethod {
// public static void main(String a[]) {

// returingvalue ob1 = new returingvalue();
// int resutl = ob1.square(5);
// System.out.println("Square of 5 is: " + resutl);
// }
// }

public class oop7returnFromMethod {
    public static void main(String a[]) {

        returingvalue ob1 = new returingvalue();
        System.out.println("Square of 5 is: " + ob1.square(5));
        System.out.println("Square of 6 is: " + ob1.square(5));
    }
}