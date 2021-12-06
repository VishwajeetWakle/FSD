
public class LambdaIntro {

	public static void main(String[] args) {
		Inter a = () -> {
			System.out.println("This is lambda Expression");
		};
		execute(a);
	}

	private static void execute(Inter a) {
		a.print();
	}
	
}
@FunctionalInterface
interface Inter {
	void print();
}