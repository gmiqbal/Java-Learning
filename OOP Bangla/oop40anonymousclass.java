class person {
    void display() {
        System.out.println("Hi");
    }
}

public class oop40anonymousclass {
    public static void main(String[] args) {
        person p = new person() {
            @override
            void display() {
                System.out.println("this is anonymous class");
            }
        };
        // weird syntax
        p.display();
    }
}