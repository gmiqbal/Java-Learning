class Teacher {
    String name, gender;
    int phone;

    // baar baar korar jonno method use kora hoy
    // methods

    void setInfo(String n, String m, int ph) {
        name = n;
        gender = m;
        phone = ph;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
        System.out.println();
    }
}

public class oop3parameter {
    public static void main(String a[]) {
        Teacher t1 = new Teacher();
        t1.setInfo("GM Iqbal", "Male", 232332);
        t1.displayInfo();

        Teacher t2 = new Teacher();
        t2.setInfo("Mahmud", "male", 23123);
        t2.displayInfo();
    }
}
