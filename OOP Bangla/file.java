import java.io.File;

public class file {
    public static void main(String[] args) {
        File dir = new File("Person");
        dir.mkdir(); // directory will be created.
        String path = dir.getAbsolutePath();
        System.out.println(dir.getAbsolutePath());

        File file1 = new File("C:\\Users\\gmiqb\\Desktop\\Java Learning\\Navin\\OOP Bangla\\Person\\student.txt");
        File file2 = new File("C:\\Users\\gmiqb\\Desktop\\Java Learning\\Navin\\OOP Bangla\\Person\\teacher.txt");
        // File file2 = new File(path + "\teacher.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Files are created");
        } catch (Exception e) {
            System.out.println(e);
        }

        if (file1.exists()) {
            System.out.println("File1 exists");
        }

        // file2.delete();

        if (file2.exists()) {
            System.out.println("File2 exists");
        } else {
            System.out.println("File2 doen't exist");
        }
    }
}
