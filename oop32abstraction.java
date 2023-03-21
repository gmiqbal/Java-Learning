abstract class mobileuser {
    abstract void sendMessage();
    // abstract class containing abstract method

    void call() {
        System.out.println("Call Method");
        // abstract class containing nonabstract method

    }
}

class rahim extends mobileuser {
    // must override abstract method as it extends abs class
    // inherited call() and sendMessage();
    @override
    void sendMessage() {
        System.out.println("Hi! I am rahim!");
    }
}

class karim extends mobileuser {
    @override
    void sendMessage() {
        System.out.println("Hi! I am karim!");
    }
}

public class oop32abstraction {
    public static void main(String[] args) {
        mobileuser mu;
        // can't have object of abstract class
        // but superclass can be referenced

        mu = new rahim();
        mu.call();
        mu.sendMessage();

        mu = new karim();
        mu.sendMessage();
    }
}