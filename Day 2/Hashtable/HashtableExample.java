import java.util.*;


public class HashtableExample {
    public static void main(String[] args) {

        Hashtable<String, Integer> hashtable = new Hashtable<>();

        hashtable.put("One", 1);
        hashtable.put("Two", 2);
        hashtable.put("Three", 3);

        System.out.println("Value corresponding to key 'Two': " + hashtable.get("Two"));

        System.out.println("Hashtable entries:");
        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

