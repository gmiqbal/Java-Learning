//superclass
class a {
    int x = 10;
}

// subclass
class b extends a {
    // int x =10;
    int x = 5;

    void displayinfo() {
        System.out.println("This is prioritized due to local variable: " + x);
        System.out.println("Here is the super class value of this variable: " + super.x);
    }
}

public class oop23superinstance {
    public static void main(String[] args) {
        b b1 = new b();
        b1.displayinfo();
    }
}
