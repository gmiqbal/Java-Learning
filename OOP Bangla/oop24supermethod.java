//superclass
class a {
    void displayinfo() {
        System.out.println("Inside a class");
    }
}

// subclass
class b extends a {
    // displayinfor already inherited

    @Override
    void displayinfo() {
        // only 'displayinfo()' confuses the compiler
        // gotta specify that i am calling 'displayinfo' from super

        super.displayinfo();
        System.out.println("Inside b class");
    }
}

public class oop24supermethod {
    public static void main(String[] args) {
        b b1 = new b();
        b1.displayinfo();
    }
}
