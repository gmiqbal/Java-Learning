class Teacher {
    String name, gender;
    int phone;

    // overloading constructor means having multiple
    // constructors in single class with different parameters

    Teacher() {
        System.out.println("No info.");
    }

    Teacher(String n, String g) {
        name = n;
        gender = g;
    }

    Teacher(String n, String g, int p) {
        name = n;
        gender = g;
        phone = p;
    }

    void displayInformation() {
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
        System.out.println();
    }
}

public class oop6overloading {
    public static void main(String a[]) {
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher("GM", "Male");
        Teacher t3 = new Teacher("Mahmud", "Male", 54545);

        t1.displayInformation();
        t2.displayInformation();
        t3.displayInformation();
    }
}