interface A {
    void play();
}

interface B {
    void play();
}

// multiple inheritance
class C implements A, B {
    public void play() {
        System.out.println("Hello i am from c");
    }

}

public class oop35mulitipleinheritance {
    public static void main(String[] args) {
        C ob = new C();
        ob.play();
    }
}
