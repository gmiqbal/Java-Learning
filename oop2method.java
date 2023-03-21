class Teacher {
    String name, gender;
    int phone;

    // baar baar korar jonno method use kora hoy
    // method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
        System.out.println();
        System.out.println();
    }
}

public class oop2method {
    public static void main(String a[]) {
        Teacher t1 = new Teacher();
        t1.name = "GM Iqbal";
        t1.gender = "Male";
        t1.phone = 1234567;

        t1.displayInfo();

        Teacher t2 = new Teacher();
        t2.name = "mahmud";
        t2.gender = "Male";
        t2.phone = 1324567;

        t2.displayInfo();
    }
}
