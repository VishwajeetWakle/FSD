
public class Parent {

	public static void main(String[] args) {
		Child1 obj = new Child1();
		exam();
		//System.out.println(obj.add(10, 60));
		//System.out.println(obj.lmn);

	}
	public static void exam() {
		Child1 obj = new Child1();
		System.out.println(obj.add(10, 60));
		System.out.println(obj.lmn);

	}
	

}
class Child1 extends Parent {
	public int add(int a, int b) {
		return a+b;
	}
	int lmn =76678;
}
