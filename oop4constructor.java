class Teacher {
    String name, gender;
    int phone;

    // baar baar korar jonno method use kora hoy

    // constructor
    // no need to call; gets called automatic
    // doesn't have return type
    // have exact same name as class
    Teacher(String n, String g, int p) {
        name = n;
        gender = g;
        phone = p;
    }

    // methods

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
        System.out.println();
    }
}

public class oop4constructor {
    public static void main(String a[]) {
        Teacher t1 = new Teacher("GM Iqbal", "Male", 232332);
        t1.displayInfo();

        Teacher t2 = new Teacher("Mahmud", "male", 23123);
        t2.displayInfo();
    }
}
