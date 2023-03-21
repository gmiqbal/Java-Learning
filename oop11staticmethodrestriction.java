//static method can't use non static member
//"this" and "super" keywords can't be used here

class staticmethod {
    static int x;

    void display1() {
        display2();
        System.out.println("I am non static method");
    }

    static void display2() {
        System.out.println(x);
        // display1();
        // doesn't work;
        System.out.println("I am static method");
    }
}

public class oop11staticmethodrestriction {
    public static void main(String[] args) {
        // staticmethod ob1 = new staticmethod();
        // ob1.display1();

        staticmethod.display2();
    }
}