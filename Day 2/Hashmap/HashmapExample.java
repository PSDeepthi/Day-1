import java.util.*;

public class HashmapExample {
    public static void main(String[] args) {
    
        Map<String, Integer> hashMap = new HashMap<String, Integer>();

        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        System.out.println("Value corresponding to key 'Two': " + hashMap.get("Two"));

        System.out.println("HashMap entries:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

