import javax.xml.transform.Source;

class person {
    String name;
    int age;
    String hair_color;

    person() {
        System.out.println();
    }

    person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    person(String name, int age, String hair_color) {
        // this.name = name;
        // this.age = age;
        // instead do this
        this(name, age);
        this.hair_color = hair_color;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age :" + age);
        System.out.println("Hair Color: " + hair_color);
        System.out.println();
    }
}

public class oop27this {
    public static void main(String[] args) {
        person p1 = new person("GM", 25);
        p1.display();

        person p2 = new person("iqbal", 23, "Black");
        p2.display();
    }
}
