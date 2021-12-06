package abc;
import java.util.LinkedList;
public class LinkedListdemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(12);
		list.add("abc");
		list.add("xyz");
		list.add(12);
		 System.out.println(list);
		 
		list.addFirst(7);
		list.addLast("end");
		
		System.out.println("List After add first & last"+list);
		
		System.out.println(list.contains("abc"));
		
		Object val = list.peek();
		 
		System.out.println("peek "+val);
		System.out.println("After peek "+list);
		
		val = list.poll();
		
		System.out.println("poll "+val);
		System.out.println("After poll "+list);
		
		val = list.pop();
		
		System.out.println("pop "+val);
		System.out.println("After pop "+list);
		
		list.push(99);
		
		list.push(00);
		
		System.out.println(list);
	}

}
