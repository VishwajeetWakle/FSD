package map;

import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put(123, "Abc");
		map.put(345, 930.9);
		map.put(122, "Pqr");
		map.put(123, "kalyan");
		map.put(123, 657.987);
		map.put(000, null);
		map.put(123, "kalyan");
		System.out.println(map);
		
		System.out.println("First Entry:  "+map.firstEntry());
		Entry firstEntry = map.firstEntry();
		
		System.out.println("First key : "+ firstEntry.getKey() + " First value : "+ firstEntry.getValue());
		
		Entry lastEntry = map.lastEntry();
		System.out.println("Last Entry : "+lastEntry);
		System.out.println("Last key : "+ lastEntry.getKey() + " Last Value : "+lastEntry.getValue());
		System.out.println("First Key : "+ map.firstKey());
		System.out.println("Last Key: "+ map.lastKey());
		System.out.println("Higher : "+ map.higherKey(122));
		System.out.println("Lower : "+ map.lowerKey(122));
		System.out.println("Ceiling : "+ map.ceilingKey(122));
		System.out.println("Floor : "+ map.floorKey(122));
	}

}
