class person {
    private String name;
    private int age;

    // done by Source Action... > Setters and Getters...

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

    // public void setName(String name) {
    // this.name = name;
    // }

    // public String getName() {
    // return name;
    // }

    // public void setAge(int age) {
    // this.age = age;
    // }

    // public int getAge() {
    // return age;
    // }

}

public class oop18encapsulation {
    public static void main(String[] args) {
        person p1 = new person();

        p1.setName("GM");
        System.out.println(p1.getName());

        p1.setAge(25);
        System.out.println(p1.getAge());
    }
}
