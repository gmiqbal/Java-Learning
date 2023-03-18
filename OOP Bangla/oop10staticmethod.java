class staticmethod {
    void display1() {
        System.out.println("I am non static method");
    }

    static void display2() {
        System.out.println("I am static method");
    }
}

public class oop10staticmethod {
    public static void main(String[] args) {
        staticmethod ob1 = new staticmethod();
        ob1.display1();

        staticmethod.display2();
    }
}
