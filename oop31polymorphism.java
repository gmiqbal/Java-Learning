class shape {

    double area() {
        System.out.print("Shpae area: ");
        return 0;
    }
}

class rectangle extends shape {
    // area()
    double length, width;

    rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @override
    double area() {
        System.out.print("Rectangle area: ");
        return length * width;
    }
}

class triangle extends shape {
    double base, height;

    triangle(double base, double height) {
        this.height = height;
        this.base = base;
    }

    @Override
    double area() {
        System.out.print("Triangle area: ");
        return 0.5 * base * height;
    }
}

public class oop31polymorphism {
    public static void main(String[] args) {

        // super class variable referencing to subclass objects
        // shape s1 = new shape();
        // shape s2 = new rectangle(10, 20);
        // shape s3 = new triangle(10, 20);

        // doing them using array
        shape[] s = new shape[3];

        s[0] = new shape();
        s[1] = new rectangle(10, 20);
        s[2] = new triangle(10, 20);

        // using for loop to print
        for (int i = 0; i < 3; i++) {
            System.out.println(s[i].area());
        }
        // System.out.println(s1.area());
        // System.out.println(s2.area());
        // System.out.println(s3.area());
    }
}
