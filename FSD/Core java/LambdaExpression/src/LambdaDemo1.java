
public class LambdaDemo1 {
	public static void main(String[] args) {
		Inter1 i1 = (val) -> 	System.out.println("The value is "+ val);
		
		i1.print("Ram");
		
		Inter2 i2 = (a, b) -> a+b;
		
		System.out.println(i2.add(12, 28));
		
		Inter3 i3 = (a ,b) -> a-b;
		
		System.out.println(i3.sub(12, 28));
	}
}
@FunctionalInterface
interface Inter1 {
	public void print(String val);
}
@FunctionalInterface
interface Inter2 {
	public int add(int a, int b);
}
@FunctionalInterface
interface Inter3{
	public int sub(int a, int b);
}
