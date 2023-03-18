class Mobile {
    String brand;
    int price;
    String network;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class statics {
    public static void main(String a[]) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 150000;
        // obj1.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Xiaomi";
        obj2.price = 25000;
        // obj2.name = "SmartPhone";

        obj1.name = "Phone (static; same for all)";

        obj1.show();
        obj2.show();
    }
}
