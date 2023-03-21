class person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

class teacher extends person {
    // getName, setAge, getAge, setAge inherited
    private String qualification;

    void displayinfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Qualification: " + getQualification());
        // can't inherit private variables
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}

public class oop20privateinheritance {
    public static void main(String[] args) {
        teacher t1 = new teacher();
        t1.setAge(25);
        t1.setName("GM");
        t1.setQualification("BSc");

        System.out.println(t1.getAge());
        System.out.println(t1.getQualification());
        System.out.println(t1.getName());
        System.out.println();
        t1.displayinfo();

        teacher t2 = new teacher();
        t2.setAge(27);
        t2.setName("iqbal");
        t2.setQualification("MSc");

        System.out.println(t2.getAge());
        System.out.println(t2.getQualification());
        System.out.println(t2.getName());
        System.out.println();
        t2.displayinfo();

    }
}
