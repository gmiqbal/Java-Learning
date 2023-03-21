class staticblock {
    static int id;
    static String name;

    static {
        System.out.println("Static Block");
        id = 101;
        name = "GM";
    }

    static void display() {
        System.out.println("id: " + id);
        System.out.println("Name: " + name);
    }
}

public class oop12staticblock {
    public static void main(String[] args) {
        staticblock.display();
        System.out.println("Main Method");
    }
}
