package map;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable map = new Hashtable();
		map.put(123, "kalyan");
		map.put(123, 657.987);
		map.put("Sushil", "Bhagde");
		map.put('A', 654);
		//map.put(null, 4444);
		//map.put(000, null);
		map.put(123, "kalyan");
		System.out.println(map);	
	}

}
