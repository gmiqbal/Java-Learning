class student {
    String name;
    int id;
    static String universityName = "KUET";

    student(String n, int i) {
        name = n;
        id = i;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("University name: " + universityName);
        System.out.println();
    }
}

public class oop8statickeyword {
    public static void main(String[] args) {
        student s1 = new student("GM", 1611019);
        student s2 = new student("Iqbal", 1611019);

        s1.displayInfo();
        s2.displayInfo();

        System.out.println(student.universityName);
    }
}
