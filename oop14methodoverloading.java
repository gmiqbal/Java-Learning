//overloading or polymorphism
// method signature (Method name + parameters)

class overload {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(double a, double b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void add() {
        System.out.println("Nothing to add");
    }
}


public class oop14methodoverloading {
    public static void main(String[] args) {
        overload ob1 = new overload();
        ob1.add(2, 2);
        ob1.add(2.0, 3.0); // invoke the overloaded method with double parameters
        ob1.add(2, 2, 2);
        ob1.add(); // invoke the method with no parameters
    }
}
