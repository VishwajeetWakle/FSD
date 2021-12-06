package Set;

import java.util.TreeSet;

public class Task1 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(11);
		set.add(12);
		set.add(20);
		set.add(18);
		set.add(66);
		set.add(98);
		set.add(76);
		set.add(87);
		set.add(27);
		set.add(97);
		set.add(60);
		set.add(38);
		System.out.println("Percentage Of Students : "+set);
		System.out.println("Lowest Percentage : "+set.first());
		System.out.println("Highest Percentage : "+set.last());
		
	}

}
