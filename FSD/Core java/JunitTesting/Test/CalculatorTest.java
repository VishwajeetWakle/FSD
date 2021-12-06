import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculatorTest {

//	Scenario 				a		b		ExpectedResult		ActualResult	TestResult
// 2 int positive values	23		12			35					35				
// 2 int negative values	-23		-12			-35					-35
// 1+ve and 1 -ve			23		-12			11
// 2 int large number		567567	456456		
	@Test
	void TestAdd_PositiveValue() {
	Calculator cal = new Calculator();
	int result = cal.add(23, 12);
	assertEquals(35, result);
	}
	@Test
	void TestAdd_NegativeValue() {
	Calculator cal = new Calculator();
	int result = cal.add(-23, -12);
	assertEquals(-35, result);
	}
	@Test
	void TestAdd_PositiveNegativeValues() {
	Calculator cal = new Calculator();
	int result = cal.add(23, -12);
	assertEquals(11, result);
	}
	@Test
	void TestAdd_LargeValue() {
	Calculator cal = new Calculator();
	long result = cal.add(567567, 456456);
	assertEquals(1024023, result);
	}

}
