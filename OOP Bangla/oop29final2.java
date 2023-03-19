// if university class were made final, won't work
// final class can't be extended

class university {

    final void display() {
        System.out.println("university class");
    }
}

class student extends university {
    // display inherited

    // final methods can't be overridden
    // but they can be inherited
    void display2() {
        System.out.println("student class");
    }
}

public class oop29final2 {

    public static void main(String[] args) {
        student s1 = new student();
        s1.display();
        s1.display2();
    }

}
