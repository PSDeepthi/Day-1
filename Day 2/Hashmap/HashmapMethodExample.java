//Methods in Hashmap:

//1. get()----> provide key it will give the value
//2. set ()---> gives all the key and value
//3. entry set()--->create a set out of the same elements contained in the hash map
//4. put()----> to update the key and entry value
//5. putall()--> copies all elements from 1 hashmap to another
//6. clear()---> empties map
//7. clone()---> makes a copy
//8. compute()---> joins with the value by mentioning the key
//9. remove()--> remove a key value pair from the hashmap



import java.util.*;

public class HashmapMethodExample {
public static void main(String[] args) {
	
	HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

	hash_map.put(10, "Hi");
	hash_map.put(15, "4");
	hash_map.put(20, "Hello");
	hash_map.put(25, "2");
	hash_map.put(30, "6");

	System.out.println("Initial Mappings are: " + hash_map); 

	String removed_value = (String)hash_map.remove(20);

	System.out.println("Removed value is: "+ removed_value);

	System.out.println("New map is: "+ hash_map);
}
}



