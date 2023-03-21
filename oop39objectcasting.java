class person {
    void display() {
        System.out.println("Person Class");
    }
}

class teacher extends person {

    void display() {
        System.out.println("teacher class");
    }
}

public class oop39objectcasting {
    public static void main(String[] args) {
        person p = new teacher();
        // subclass er object i.e new teacher ke super class i.e person e rakhlam
        // upcasting
        p.display();

        teacher t = (teacher) new person();
        // downcasting
        // compile time ok
        // run time error
    }

}
