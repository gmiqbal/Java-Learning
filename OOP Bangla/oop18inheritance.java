class person {
    String name;
    int age;

    void displayinfo() {
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
    }
}

class teacher extends person {
    // name ,age
    // displayinfo
    // is loaded from person class

    String qualifiation;

    void displayinfo2() {
        // System.out.println("Name: " + name);
        // System.out.println("Age: " + age);
        displayinfo();
        System.out.println("Qualification: " + qualifiation);
        System.out.println();
    }
}

public class oop18inheritance {
    public static void main(String[] args) {
        teacher t1 = new teacher();
        t1.name = "GM";
        t1.age = 25;
        t1.qualifiation = "BSc";

        t1.displayinfo2();

        teacher t2 = new teacher();
        t2.name = "GM Iqbal";
        t2.age = 25;
        t2.qualifiation = "MSc";

        t2.displayinfo2();
    }
}
