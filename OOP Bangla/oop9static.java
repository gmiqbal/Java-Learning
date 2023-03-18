class Student {
    static int count = 0;
    // relate it with class by making it static
    // rather that being non-static and relating to object

    Student() {
        count++;
    }

    void totalStudent() {
        System.out.println("Total Students: " + count);
    }
}

public class oop9static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.totalStudent();
        Student s2 = new Student();
        s2.totalStudent();
        Student s3 = new Student();
        s3.totalStudent();
    }
}
