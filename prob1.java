class box {
    double height, width, depth; // instance variable

    box(double height, double width, double depth) {
        // local variable
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    void displayVol() {
        double volume = height * width * depth;
        System.out.println("The volume of the box is:" + volume);
    }
}

public class prob1 {
    public static void main(String[] args) {
        box b1 = new box(10, 10, 10);
        b1.displayVol();

        box b2 = new box(20, 30, 10);
        b2.displayVol();
    }
}
