package map;

import java.util.LinkedHashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap map = new LinkedHashMap();
		map.put(123, "kalyan");
		map.put(123, 657.987);
		map.put("Sushil", "Bhagde");
		map.put('A', 654);
		map.put(null, 4444);
		map.put(000, null);
		map.put(123, "kalyan");
		System.out.println(map);
		
		System.out.println("Keys : "+ map.keySet());
		System.out.println("Values : "+ map.values());
		
		System.out.println(map.get(123));
		
		map.remove("kalyan");
		
		System.out.println(map);
		
		System.out.println(map.containsKey(123));
		System.out.println(map.containsValue(7777));
	}

}
