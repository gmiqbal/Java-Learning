//declaring a method in subclass which is already 
//pressent in superclass

class person {
    String name;
    int age;

    void displayinfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class teacher extends person {
    String qualification;

    @Override
    void displayinfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Qualification: " + qualification);
    }
}

public class oop22methodoverriding {
    public static void main(String[] args) {
        teacher t1 = new teacher();
        t1.name = "lksjalf";
        t1.age = 25;
        t1.qualification = "B";
        t1.displayinfo();

        person p1 = new person();
        p1.name = "dfgdfg";
        p1.age = 125;
        p1.displayinfo();

    }

}
