interface animal {
    void eat();
    // same as
    // public abstract void eat();
}

class dog implements animal {
    public void eat() {
        System.out.println("dog is pagla");
    }
}

class cat implements animal {
    public void eat() {
        System.out.println("cat is CAT");
    }
}

public class oop34interface {
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        // interface (animal) can't have object

        cat c = new cat();
        c.eat();
    }
}
