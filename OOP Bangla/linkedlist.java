import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> countrynames = new LinkedList<String>();
        countrynames.add("Bangladesh");
        countrynames.add("India");
        countrynames.add("USA");
        countrynames.add("UK");
        // indexed
        countrynames.add(2, "Brazil");
        // addfirst and last
        countrynames.addFirst("Australia");
        countrynames.addLast("Japan");

        // System.out.println(countrynames);
        // countrynames.remove("Japan")
        // countrynames.remove(4);
        // countrynames.removeFirst();
        // countrynames.removeLast();

        for (String country : countrynames) {
            System.out.println(country);
        }
        System.out.println("Size of linkedlist: " + countrynames.size());

        System.out.println("The first element is : " + countrynames.getFirst());
        System.out.println("The last element is : " + countrynames.getLast());

        countrynames.clear();
        System.out.println(countrynames);

    }
}