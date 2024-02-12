// Diff between Hashtable and Properties: 
//Hashtable is used in earlier versions and format: ("String", int) but in properties the key and value both must be in strings


import java.util.Hashtable;
import java.util.Properties;

public class HashtableProp{
    public static void main(String[] args) {
    
    	// Hashtable
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("One", 1);
        hashtable.put("Two", 2);

        System.out.println("Hashtable:");
        System.out.println("Value of key 'Two': " + hashtable.get("Two"));
        System.out.println("Hashtable size: " + hashtable.size());
        System.out.println();
        
	// Properties
        Properties properties = new Properties();
        properties.setProperty("name", "John Doe");
        properties.setProperty("age", "25");

        System.out.println("Properties:");
        System.out.println("Name: " + properties.getProperty("name"));
        System.out.println("Age: " + properties.getProperty("age"));
    }
}

