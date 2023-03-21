import javax.xml.transform.Source;

class Teacher {
    String name, gender;
    int phone;
}

public class oop1 {
    public static void main(String a[]) {
        Teacher t1 = new Teacher();
        t1.name = "GM Iqbal";
        t1.gender = "Male";
        t1.phone = 1234567;

        System.out.println("Name: " + t1.name);
        System.out.println("Gender: " + t1.gender);
        System.out.println("Phone: " + t1.phone);

        System.out.println();

        Teacher t2 = new Teacher();
        t2.name = "mahmud";
        t2.gender = "Male";
        t2.phone = 1324567;

        System.out.println("Name: " + t2.name);
        System.out.println("Gender: " + t2.gender);
        System.out.println("Phone: " + t2.phone);
    }
}
