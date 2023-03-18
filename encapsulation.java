class Human {
    // restricting by private
    private String name = "GM";
    private int age = 11;

    // getter

    public int getAge()

    {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName()

    {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class encapsulation {
    public static void main(String a[]) {
        Human obj = new Human();
        obj.setAge(25);
        obj.setName("GM Iqbal");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }

}
