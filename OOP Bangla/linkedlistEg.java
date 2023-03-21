import java.util.LinkedList;

class student {
    String name, classname;
    int id;

    student(String name, String classname, int id) {
        this.id = id;
        this.name = name;
        this.classname = classname;
    }
}

public class linkedlistEg {
    public static void main(String[] args) {
        // student linked list
        LinkedList<student> list = new LinkedList<student>();

        // student creation
        student s1 = new student("GM", "Eleven", 1);
        student s2 = new student("Iqbal", "Eleven", 2);
        student s3 = new student("Mahmud", "Eleven", 3);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        // display
        for (student s : list) {
            System.out.println(s.id + "  " + s.name + "  " + s.classname);
        }

    }
}
