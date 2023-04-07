import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapHashTable {
	
    
	private static final Set<java.util.Map.Entry<Character, String>> EntryCharacter = null;

	// Hashmap & Hashtable -> key-value pair -> HashMap class -> HashTable class 
	
	
	public static void main(String[] args) {
//		HashMap hm = new HashMap(); // raw type/non-parameterized
		HashMap<Character,String> hm = new HashMap<Character,String>();
		
		
		  // insert value
		hm.put('A',"Apple");
		hm.put('J',"Juice");
		hm.put('C',"Carrot");
		hm.put('K',"Kite");
		hm.put('B',"Ball");
		
		System.out.println(hm);
		
		System.out.println(hm.get('K'));
		System.out.println(hm.get('M'));
		
		// to get all keys 
		Set<Character> keys = hm.keySet();
		System.out.println(keys);
		
		Collection<String> allValues = hm.values();
        System.out.println(allValues);
        
        Set<Entry<Character, String>>valueSet= hm.entrySet();
        
        
        hm.remove('B');
        System.out.println(hm);
        
        System.out.println("Number of key-value pair: "+hm.size());
        
        
        

		
		
		
		
		
		
		 
	}
}
