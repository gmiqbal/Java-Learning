class Teacher {
    String name, gender;
    int phone;

    // default constructor
    // Created automatically if not created manually
    Teacher() {
        System.out.println("no value");
    }

    // patamerized consturctor
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

public class oop5constructortypes {
    public static void main(String a[]) {
        Teacher t1 = new Teacher("GM Iqbal", "Male", 232332);
        t1.displayInfo();

        Teacher t2 = new Teacher("Mahmud", "male", 23123);
        t2.displayInfo();

        Teacher t3 = new Teacher();
        t3.displayInfo();
    }
}
