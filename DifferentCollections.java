package week4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class DifferentCollections {
	
	private static final int HashMap = 0;
	private static final int String = 0;
	private static Map<Integer, String> dictionary;

	public static void main(String[] srgs) {
		
		/*
		 * List
		 * 
		 * Allows duplicates
		 * Keeps elements ordered by index
		 * Allows null values
		 * Common implementations: ArrayList, LinkedList, Vector
		 */
		List<String> students = new ArrayList<String>();
		students.add("Jordan");
		students.add("Elijah");
		students.add("Raymond");
		students.add(null);
		
		for (String student : students) {
			System.out.println(student);
		}
		
		System.out.println(students.get(2)); //Raymond
		System.out.println(students.get(0)); //Jordan
		
		/*
		 * Set
		 * 
		 * No duplicates
		 * Unordered
		 * Allows null value
		 * Common implementations: HasSets, LinkedHasSet, TreeSet
		 */
		Set<String> states = new HashSet<String>();
		states.add("Alabama");
		states.add("Alaska");
		states.add("Arizona");
		states.add("Arkanasas");
		states.add("California");
		states.add(null);
		
		
		System.out.println(states.size());
		System.out.println(states.contains("Alabama"));
		if (states.contains("Alabama")) {
		states.remove("Alabama");
		
		for (String state : states) {
			System.out.println(state);
			
		}
		
		/*
		 * Map
		 * 
		 * Map<K,V> K is the key, and V is a the value
		 * Key value pairs (dictionary)
		 * Values can be duplicate, but not keys
		 * Common Implementations: HashMap, LinkedHashMap, TreeMap, Hastable
		 * 
		 * 
		 */
		Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
		racerPlacements.put(1, "Tommy");
		racerPlacements.put(2, "Chris");
		racerPlacements.put(3, "John");
		
		System.out.println(racerPlacements.get(1));
		
		racerPlacements.remove(1);
		
		Set<Integer> racerKeys = racerPlacements.keySet();
		for (Integer key : racerKeys) {
			System.out.println(key + " : " + racerPlacements.get(key));
		}
		
		Collection<String> racers = racerPlacements.values();
		for (String racer : racers) {
			System.out.println(racer);
		}
		
		Map<String, String> dictionary = new HashMap<String, String>();
		
		dictionary.put("Augment","make (something) greater by adding to it; increase.");
		dictionary.put("Diminish", "make or become less");
		dictionary.put("ostentatious", "characterized by vulgar or prententious display; designed to impress");
				
				
				
		
	}
	}
}
	

	
