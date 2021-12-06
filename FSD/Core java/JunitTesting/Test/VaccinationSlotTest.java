import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class VaccinationSlotTest {

	private static VaccinationSlot vaccinationSlot;
	@BeforeAll
	public static void initObject() {
		vaccinationSlot = new VaccinationSlot();
	}
	/*
	 * 	Scenario					age				Expected
	 * Positive Age					50				2nd Slot			
	 * Negative Age					-50				IllegalArgumentException
	 * First Boundary age			1				4th Slot
	 * Last Boundary age			110				1st Slot
	 * First invalid Boundary age	0				IllegalArgumentException
	 * Last invalid Boundary age	111				IllegalArgumentException 
	 * Test slot 3					30				3rd Slot
	 */
	
	@Test
	public void getVaccinationSlotTest_PositiveAge() {
		String result = vaccinationSlot.getVaccinationSlot(50);
		assertEquals("2nd Slot", result);
	}
	
	@Test
	public void getVaccinationSlotTest_NegativeAge() {
		assertThrows(IllegalArgumentException.class, 
				() -> vaccinationSlot.getVaccinationSlot(-50));
	}
	 
	@Test
	public void getVaccinationSlotTest_FirstBoundaryAge() {
		String result = vaccinationSlot.getVaccinationSlot(1);
		assertEquals("4th Slot", result);
	}
	
	@Test
	public void getVaccinationSlotTest_LastBoundaryAge() {
		String result = vaccinationSlot.getVaccinationSlot(110);
		assertEquals("1st Slot", result);
	}
	
	@Test
	public void getVaccinationSlotTest_InvalidFirstBoundryAge() {
		assertThrows(IllegalArgumentException.class, 
				() -> vaccinationSlot.getVaccinationSlot(0));
	}
	
	@Test
	public void getVaccinationSlotTest_InvalidLastBoundryAge() {
		assertThrows(IllegalArgumentException.class, 
				() -> vaccinationSlot.getVaccinationSlot(111));
	}
	
	@Test
	public void getVaccinationSlotTest_3rdSlot() {
		String result = vaccinationSlot.getVaccinationSlot(30);
		assertEquals("3rd Slot", result);
	}
	
}
