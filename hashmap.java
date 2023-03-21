import java.util.HashMap;

// Hashmap hoilo Key-value

public class hashmap {
    public static void main(String[] args) {
        // put, get
        HashMap<Integer, String> customer = new HashMap<Integer, String>();
        customer.put(101, "GM");
        customer.put(102, "Iqbal");
        customer.put(103, "Mahmud");

        System.out.println(customer.get(102));
    }
}
