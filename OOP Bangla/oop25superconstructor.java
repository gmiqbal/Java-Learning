//superclass
class a {
    a() {
        System.out.println("a's constructor");
    }
}

// subclass
class b extends a {
    // inherited a class and it's constructor

    b() {
        super();
        System.out.println("b's constructor");
    }
}

public class oop25superconstructor {
    public static void main(String[] args) {
        b b1 = new b();
    }
}