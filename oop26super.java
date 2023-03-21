class vehicle {
    String color;
    double weight;

    vehicle(String c, double w) {
        color = c;
        weight = w;
    }

    void attribute() {
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
    }
}

class car extends vehicle {
    // color, weight
    // vehicle constructor
    // attribute method
    // loaded...

    int gear;

    car(String c, double w, int g) {
        // color =c;
        // weight =w;
        super(c, w); // calling the constructor of vehicle class
        // this super needs to be in the first line
        gear = g;
    }

    @Override
    void attribute() {
        super.attribute();
        System.out.println("Gear: " + gear);
    }
}

public class oop26super {
    public static void main(String[] args) {
        car volvo = new car("White", 350, 5);
        volvo.attribute();
    }
}
