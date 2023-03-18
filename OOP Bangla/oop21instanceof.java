class animal {

}

class person extends animal {

}

class teacher extends person {

}

public class oop21instanceof {
    public static void main(String[] args) {
        animal a = new animal();
        person p = new person();
        teacher t = new teacher();

        System.out.println(a instanceof animal);
        System.out.println(p instanceof animal);
        System.out.println(t instanceof person);
        System.out.println(t instanceof animal);
        System.out.println(p instanceof teacher);

        // think of it like ouline below:
        // Animal(a)
        // ....Person (p)
        // .........Teacher (t)

        // instanceof ~ purbopurush kina?
        // even though t er purbopurush p and a;
        // kintu p er purbopurush toh teacher na.
        // tai last ta False asche.
    }
}
