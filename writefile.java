import java.util.Formatter;
import java.util.Scanner;

public class writefile {
    public static void main(String[] args) {

        String id, name;
        try {
            Formatter formatter = new Formatter(
                    "C:\\Users\\gmiqb\\Desktop\\Java Learning\\Navin\\OOP Bangla\\Person\\student.txt");

            Scanner input = new Scanner(System.in);
            System.out.println("How many students?");
            int num = input.nextInt();

            for (int i = 1; i <= num; i++) {
                System.out.println("Enter student ID and name: ");
                id = input.next();
                name = input.next();
                formatter.format("%s %s\r\n", id, name);
            }

            // formatter.format("%s %s\r\n", "101", "GM");
            // formatter.format("%s %s\r\n", "102", "Iqbal");
            // formatter.format("%s %s\r\n", "101", "Mahmud");
            formatter.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
