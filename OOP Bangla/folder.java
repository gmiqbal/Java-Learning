import java.io.File;

public class folder {
    public static void main(String[] args) {
        File dir = new File("person");

        // person folder created at project directory

        // for creating in let's say desktop
        // File dir = new File("C:\\Users\\gmiqb\\Desktop\\person");
        dir.mkdir(); // directory will be created

        // return path of file
        String dirlocation = dir.getAbsolutePath();
        System.out.println(dirlocation);
        System.out.println(dir.getName());

        // deleting directory
        if (dir.delete()) {
            System.out.println(dir.getName() + " has been deleted");
        }
    }
}
