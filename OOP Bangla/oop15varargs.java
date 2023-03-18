class adddemo {
    void add(int... num) {
        // int... means it can takes any no of values
        int sum = 0;
        for (int x : num) {
            sum = sum + x;
        }
    }
}

public class oop15varargs {
    public static void main(String[] args) {
        adddemo ob1 = new adddemo();
        ob1.add(1, 2, 3);
        ob1.add(1, 2, 3, 4);
        ob1.add(1, 2, 3, 6, 8);
    }
}
