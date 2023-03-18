public class strings {
    public static void main(String a[]) {
        /// String name = "GM";
        StringBuffer sb = new StringBuffer("GM");
        sb.append(" Iqbal");

        // sb.deleteCharAt(2);
        sb.insert(3, "Hola ");
        sb.setLength(30);
        sb.ensureCapacity(100);

        System.out.println(sb);
    }
}
