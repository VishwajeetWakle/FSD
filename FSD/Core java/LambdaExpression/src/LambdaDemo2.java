import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo2 {
	public static void main(String[] args) {
		Predicate<Integer> obj = (val) -> val%2==0;
		System.out.println(obj.test(12));
		Predicate<Integer> obj1 = (a) -> a%2==0;
		System.out.println(obj1.test(11));
		System.out.println("=============================");
		Function<Integer , Integer> obj2 = (num) -> num*num; 
		System.out.println(obj2.apply(12));
		Supplier<Integer> obj3 = () -> {
			return 23*23;
		
		};
		System.out.println(obj3.get());
	}
}
