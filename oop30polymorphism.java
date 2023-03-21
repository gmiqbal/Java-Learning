class person {
    void display() {
        System.out.println("I am person");
    }
}

class teacher extends person {
    // display()

    @Override
    void display() {
        System.out.println("I am teacher");
    }
}

class student extends person {
    void display() {
        System.out.println("I am student");
    }
}

public class oop30polymorphism {
    public static void main(String[] args) {
        // person p = new person();
        // teacher t = new teacher();
        // student s = new student();

        // p.display();
        // t.display();
        // s.display();

        person p = new person();
        p.display();

        p = new teacher();
        p.display();

        p = new student();
        p.display();
    }
}
