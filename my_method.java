class Computer {
    public void playMusic() {
        System.out.println("Playing Music...");
    }

    public String getMeaPen(int cost) {
        if (cost >= 10)
            return "Pen";
        else
            return "Nothing!";
    }
}

// class classname
// public type_of_return behaviour()
// {
// Method
// }

public class my_method {
    public static void main(String a[]) {

        Computer obj = new Computer();
        obj.playMusic();

        String str = obj.getMeaPen(10);
        System.out.println(str);

    }
}