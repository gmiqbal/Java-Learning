class person {
    String name;
    int age;

    person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }
}

public class toString {
    public static void main(String[] args) {
        person p1 = new person("GM", 24);
        person p2 = new person("Iqbal", 24);

        System.out.println(p1); // calls toString by default
        System.out.println(p2);
    }
}
