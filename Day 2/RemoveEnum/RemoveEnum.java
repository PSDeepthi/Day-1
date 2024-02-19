import java.util.*;
public class RemoveEnum {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("key1", "value1");
        properties.setProperty("key2", "value2");
        properties.setProperty("key3", "value3");

        Set<Object> keySet = properties.keySet();
        Iterator<Object> iterator = keySet.iterator();

        while (iterator.hasNext()) { // hasNext() to check if there's more elements and returns value in boolean
            Object key = iterator.next();
            if (key.equals("key2")) {
                iterator.remove(); // To Remove the element while iterating
            }
        }

        System.out.println(properties); 
    }
}

