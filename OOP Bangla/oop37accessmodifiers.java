class a {
    protected void display() {
        System.out.println("Hi!");
    }
}

public class oop37accessmodifiers {
    public static void main(String[] args) {
        // a ob = new a();
        // ob.display();
        // private method won't show here

        a ob = new a();
        ob.display();

        // protected won't allow using the method in different package
        // if nothing is written, it's default. can be used in same package

    }
}
