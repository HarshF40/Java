import java.awt.RenderingHints.Key;
import java.util.*;

public class Adv {

	public static void main(String[] args) {
		int[] normArr = {1,2,3}; //Normal way of making array
		//List is wrapper of the above implementation and provides many features
		List<String> arr = new ArrayList<>(); //List of strings only
		//List is a parent class of ArrayList
		//List is a generic interface
		//ArrayList is a resizable array implementation List (at runtime)
		//Why List instead ArrayList? --> because it provides flexibility
		//List is a parent of may other List likes ArrayList, LinkedList, Vector, etc
		//So we can change it easily when we need
		//<> -> type inference, like templates
		List<Object> objArr = new ArrayList<>(); //List of any data type mixed
		List<Integer> intArr = new ArrayList<>();
		intArr.add(8);
		intArr.add(2);
		intArr.add(5);
		intArr.add(1);
		intArr.add(9);

		for(int i = 0; i < normArr.length; i++){
			System.out.print(normArr[i] + " ");
		}

		System.out.println("");

		for(int i = 0; i < intArr.size(); i++){
			System.out.print(intArr.get(i) + " ");
		}

		System.out.println("");

		////////Maps

		//Map is parent of HashMap;
		Map<String, Integer> map = new HashMap<>();
		map.put("key1", 8);
		map.put("key2", 9);
		map.put("key3", 5); //adding key value pairs in HashMap

		//Loop to iterate over key value pairs
		//map.entrySet() -> returns a set of key value mappings
		//Map.Entry<String, Integer> -> represents a single entry in the map
		//entry -> iterates over each pair in map
		//
		//Set<> -> a collection of unique element
		//Map.Entry<K,V> -> represents a single key value pair inside Map<K,V>
		//Set<Map.Entry<K,V>> -> collection of many entries
		//
		//.entrySet() -> return a set of key, value pair [Set<Map.Entry<k,v> -> this is returned]
		//each element in this set is a type of Map.Entry<K, V> which represents a single key value
		//now we iterate over each of the element
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.print(entry.getKey() + "-> ");
			System.out.print(entry.getValue());
			System.out.println("\n----------");
		}

		//We use Map because its the parent and the hashMap is converted to set at runtime
		//List, Map, Set, ImmutableList


		////////Optional

		//System.out.println(map.get("key4") > 10); //this gives NullPointerException
		//thats why we use optional, it helps to tackle with NPE
		//ofNullable return value if value is there or return a empty optional thats why ofNullable
		Optional<Integer> val = Optional.ofNullable(map.get("key4")) ;
		if(val.isPresent()) {
			System.out.println(val);
		} else {
			System.out.println("NULL value");
		}
		System.out.println("");
	}

}
