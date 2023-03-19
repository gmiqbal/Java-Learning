//final diye user ke restrict kora jay 
//final variable / method / class

class university {
    final String UNI_NAME = "KUET";
    // ^ final variable with fixed value
    int fees;
    // aka blank final value; not initialized
    // blank final variables are to be initialized
    // by constructors
    static final String location;
    // static blank final variable
    // it has to be initialized by static block

    static {
        location = "Khulna";
    }

    // constructor
    university() {
        fees = 27000;
    }

    void display() {
        // UNI_NAME = "JU" won't work
        // as UNI_NAME is declared as final
        System.out.println(UNI_NAME);
        System.out.println(fees);
        System.out.println(location);
    }
}

public class oop28final {
    public static void main(String[] args) {
        university u1 = new university();
        u1.display();
    }
}
