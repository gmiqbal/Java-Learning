abstract class shape {
    double dim1, dim2;

    shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract void area();
}

class rectangle extends shape {
    // dim1, dim2
    rectangle(double dim1, double dim2) {
        // this.dim1 =dim1;
        // this.dim2 = dim2;
        super(dim1, dim2);
    }

    void area() {
        double result = dim1 * dim2;
        System.out.println("Rectangle ares is " + result);
    }
}

class circle extends shape {
    // dim1, dim2
    circle(double r) {
        super(r, r);
    }

    void area() {
        double result = Math.PI * dim1 * dim2;
        System.out.println("Circle area is " + result);
    }
}

class triangle extends shape {
    // dim1, dim2
    triangle(double dim1, double dim2) {
        // this.dim1 =dim1;
        // this.dim2 = dim2;
        super(dim1, dim2);
    }

    void area() {
        double result = 0.5 * dim1 * dim2;
        System.out.println("triangle ares is " + result);
    }
}

public class oop33problem2 {
    public static void main(String[] args) {
        shape shapeeee;
        shapeeee = new rectangle(10, 20);
        shapeeee.area();

        shapeeee = new triangle(10, 20);
        shapeeee.area();

        shapeeee = new circle(10);
        shapeeee.area();
    }
}
